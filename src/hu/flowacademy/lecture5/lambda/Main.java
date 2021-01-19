package hu.flowacademy.lecture5.lambda;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Transformable<String, String> transformer = s -> {
            // java.lang.String immutable --> ezért van a StringBuilder
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char act = s.charAt(i);
                if (i % 2 == 0) { // i páros
                    act = Character.toUpperCase(act);
                }
                sb.append(act);
            }

            return sb.toString(); // <-> build() metódus (ezzel készül el a string)
        };

        List<String> list = List.of( // immutable lista lesz (List.of)
                "abcdefghjkl",
                "foobar",
                "barfoo",
                "foobaz"
        );

        list.stream() // -> a kollekció elemekből képezett "folyam"
                .map(transformer::transform) // -> metódus referencia
                .forEach(System.out::println);
    }
}

// Ő egy funkcionális interface - SAM: Single Abstract Method
@FunctionalInterface
interface Transformable<T, R> { // R - return type, T - parameter type
    R transform(T param);
}