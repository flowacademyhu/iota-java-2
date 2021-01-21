package hu.flowacademy.lecture6.stream;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> words = List.of("public", "static", "void", "main", "string", "args[]");

        // számoljuk meg és írjuk ki a szavak hosszát
        words.stream()
                .mapToInt(String::length); // közbülső műveletek
        // lazy kiértékelés miatt, ez most nem fog semmit csinálni
    }

}
