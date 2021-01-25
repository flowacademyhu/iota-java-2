package hu.flowacademy.lecture7.intermediate;

import hu.flowacademy.lecture7.model.Actor;
import hu.flowacademy.lecture7.model.Film;
import hu.flowacademy.lecture7.utils.FilmReader;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        // Source
        List<Film> films = FilmReader.readFilms();

        // Filmek gyártási éve (distinct = kiszűri a duplikátumokat)
        films
                .stream()
                .mapToInt(Film::getYear)
                .distinct()
                .forEach(System.out::println);

        // Számoljuk meg a Drama-kat!
        long numberOfDramas = films
                .stream()
                .filter(film -> film.getCategories().contains("Drama"))
                .count();
        System.out.println(numberOfDramas);

        // Írassuk ki az összes színész nevét!
        // Flatten: flatten([ [1,2,3], [4,5,6], [7,8,9]]) = [1,2,3,4,5,6,7,8,9]
        films
                .stream()
                // .map(e -> e.getActors().stream()) // probléma: Stream<Stream<Actor>>
                .flatMap(e -> e.getActors().stream()) // Stream<Actor>
                .map(Main::formatActorName)
                .distinct()
                .forEach(System.out::println);

        // Vonjunk ki véletlenszerűen egy (15..30) számot a filmek kiadási évéből!
        // Tároljuk is el a films Listában!
        // ThreadLocalRandom
        //ThreadLocalRandom.current()
        //        .ints(1000, 15, 31)
        //        .map(i -> {
        //
        //        }) // int -> Film
        Random random = new Random();
        List<Film> films2 =
                films
                        .stream()
                        //.map(film -> {
                        //    int year = film.getYear();
                        //    int difference = random.nextInt(15) + 15;
                        //    int newYear = year - difference;
                        //    film.setYear(newYear);
                        //    return film;
                        //})
                        .peek(film -> { // visszatér a "paraméterével" ~ hasonló a forEachhez, de ez visszatér
                            int year = film.getYear();
                            int difference = random.nextInt(15) + 15;
                            int newYear = year - difference;
                            film.setYear(newYear);
                        })
                        .collect(Collectors.toList());

        // Melyik a legrégebbi kiadási év?
        int oldestDate = films2
                .stream()
                .mapToInt(Film::getYear)
                .min()
                .orElseThrow();
        System.out.println(oldestDate);

        // Melyik a legrégibb film (ismerjük a kiadás évét)?
        films2
                .stream()
                .filter(film -> film.getYear() == oldestDate) // kiválasztom ezzel az évvel megegyező évű filmeket
                .forEach(System.out::println);

        // Melyik évben hány filmet gyártottak?
        Map<Integer, Long> frequency = films2
                .stream()
                .collect(Collectors.groupingBy(
                        Film::getYear,
                        Collectors.counting())
                );
        //Map<Integer, Long> frequency = films2
        //        .stream()
        //        .map(Film::getYear)
        //        .collect(Collectors.groupingBy(
        //                Function.identity(),
        //                Collectors.counting())
        //        );
        /* ~ SQL-ben:
         * select count(1) from films
         * group by year
         * */
        System.out.println(frequency);

        // Filmek átlagos "életkora"?
        System.out.println();
        double averageAge = films2
                .stream()
                .mapToInt(film -> 2021 - film.getYear())
                .average()
                .orElseThrow();
        System.out.println(averageAge);

        // Melyik a leggyakoribb nyelv?
        Map.Entry<String, Long> mostCommonLanguage = films2
                .stream()
                .collect(Collectors.groupingBy(
                        Film::getLanguage,
                        Collectors.counting())
                ) // Map<String, Long> <Nyelv, Nyelvek száma>
                .entrySet()
                .stream()
                //.max((e1, e2) -> {
                //    long year1 = e1.getValue(); // nyelvek száma
                //    long year2 = e2.getValue();
                //    return Long.compare(year1, year2);
                //}) <-> ez ekvivalens ezzel ni ->
                // ->
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .orElseThrow();

        System.out.println(mostCommonLanguage);

        // Melyik a leghosszabb/legrövidebb film?
        // Az előzőhöz hasonlóképp megoldható, csak mást kell a groupingBy-ban alkalmazni

        // Hossz mediánja?
        // medián: növekvő sorrendbe RENDEZEM, megnézem, hogy páros/páratlan az elemek száma
        // ha páros: avg(középső elem, középső elem + 1)
        // ha páratlan: középső elem
        List<Integer> data = List.of(1,2,34);
        double median = data
                .stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .skip(Math.max(0, (data.size() + 1) / 2 - 1)) // eldobja az első felét az elemeknek -> 499-et skippel
                .limit(1 + (1 + data.size()) % 2) // kiválaszt egyet, vagy kettőt (attól függően, h. páros vagy páratlan elem van a listában)
                .average()
                .orElseThrow();
        System.out.println(median);
    }

    static String formatActorName(Actor actor) {
        StringBuilder fullName = new StringBuilder();

        fullName.append(actor.getFirstName().charAt(0));
        fullName.append(actor.getFirstName().substring(1).toLowerCase());
        fullName.append(" ");
        fullName.append(actor.getLastName().charAt(0));
        fullName.append(actor.getLastName().substring(1).toLowerCase());

        return fullName.toString();
    }
}
