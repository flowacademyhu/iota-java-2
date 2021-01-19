package hu.flowacademy.lecture5.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(13);

        optional.ifPresent(n -> System.out.println(n));
    }

    static Optional<Number> getNumber() {
        Optional<Number> myNumber = Optional.of(543.1233);
        return myNumber;
    }
}
