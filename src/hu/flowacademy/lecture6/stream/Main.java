package hu.flowacademy.lecture6.stream;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.
                <Integer>builder()
                .add(1)
                .add(2)
                .add(3)
                .build();
    }
}
