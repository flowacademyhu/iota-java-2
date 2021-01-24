package hu.flowacademy.lecture7;

import hu.flowacademy.lecture7.utils.FilmReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FilmReader.readFilms().forEach(System.out::println);
    }
}
