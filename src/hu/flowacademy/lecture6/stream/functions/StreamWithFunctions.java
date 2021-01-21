package hu.flowacademy.lecture6.stream.functions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

public class StreamWithFunctions {
    public static void main(String[] args) {
        // függvények használata streamekkel
        // Stream.generate() // Supplier
        Person p1 = new Person("Bálint", 28, "kék", 180);
        Person p2 = new Person("Ferenc", 34, "lila", 123);
        Person p3 = new Person("Ádám", 74, "barna", 250);
        Person p4 = new Person("Jenő", 12, "nincs", 150);

        List<Person> people = List.of(p1, p2, p3, p4);

        people.stream()
                .map(person -> {
                    // Felhasználónév generátor
                    // felhasználónév = kisbetűs(név) + _ + magasság
                    String username = person.getName().toLowerCase() + "_" + person.getHeight();
                    return username;
                });
                // .count(); // terminal operation: megszámolja a streamben levő elemeket
                // .collect(Collectors.toList()); // terminal operation

        Person feri = people.stream()
                .filter(person -> "Ferenc".equals(person.getName())) // Predicate<T> -> boolean: milyen elemeket szeretnék kiválasztani?
                .findFirst() // terminal operation
                .orElseThrow(); // ha null -> exception

        // .map
        // .filter
        // TODO: .reduce
    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private int age;
    private String hairColor;
    private int height;
}