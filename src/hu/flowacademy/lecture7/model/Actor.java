package hu.flowacademy.lecture7.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class Actor implements Serializable {
    @Serial
    private static final long serialVersionUID = 3664369255038483380L;
    private final String firstName;
    private final String lastName;
}
