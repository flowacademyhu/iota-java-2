package hu.flowacademy.lecture7.model;

import lombok.Data;
import lombok.Setter;

import java.io.*;
import java.util.List;

@Data
@Setter
public class Film implements Serializable {
    private static final long serialVersionUID = 6386662344085784159L;

    private int id;
    private String title;
    private String description;
    private int year;
    private String language;
    private int length;
    private List<Actor> actors;
    private List<String> categories;
}

class Main {
    public static void main(String[] args) {
        // szerializáció
        //Film f = new Film(
        //        1,
        //        "The Shawshank Redemption",
        //        "Morgan Freeman",
        //        1992,
        //        "English",
        //        120,
        //        List.of(),
        //        List.of("Drama")
        //);
//
        //FileOutputStream out = new FileOutputStream("film.bin");
        //ObjectOutputStream oos = new ObjectOutputStream(out);
//
        //oos.writeObject(f);
//
        //oos.close();
        //out.close();

        // deszerializáció
        // java 7-8: try-with-resources (AutoCloseable)
        try (
                FileInputStream fis = new FileInputStream("film.bin");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Film f = (Film) ois.readObject();
            System.out.println(f.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
