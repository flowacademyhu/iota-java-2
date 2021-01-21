package hu.flowacademy.lecture6.stream.creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creation {
    public static void main(String[] args) {
        // üres stream
        Stream<Object> emptyStream = Stream.empty();

        // kézzel soroljuk fel az elemeket
        Stream<Integer> numbers = Stream.of(1, 1, 2, 3, 5, 8, 13, 21, 34);

        // kollekcióból is tudunk
        List<String> l = Arrays.asList("kutya", "cica", "egér");
        Stream<String> animalStream = l.stream();

        // tömbökből is
        String[] animals = { "ló", "bárány", "kecske"};
        Stream<String> an = Stream.of(animals);
    }
}
