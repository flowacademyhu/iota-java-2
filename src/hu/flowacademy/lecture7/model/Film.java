package hu.flowacademy.lecture7.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
public class Film implements Serializable {
    @Serial
    private static final long serialVersionUID = 6386662344085784159L;
    private final int id;
    private final String title;
    private final String description;
    private final int year;
    private final String language;
    private final int length;
    private final List<Actor> actors;
    private final List<String> categories;
}
