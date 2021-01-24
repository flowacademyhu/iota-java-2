package hu.flowacademy.lecture7.utils;

import hu.flowacademy.lecture7.model.Film;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class FilmReader {
    private static List<Film> films;

    public static List<Film> readFilms() throws IOException, ClassNotFoundException {
        if(films == null) {
            FileInputStream fis = new FileInputStream("films.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            films = (List<Film>) ois.readObject();
        }
        return films;
    }
}
