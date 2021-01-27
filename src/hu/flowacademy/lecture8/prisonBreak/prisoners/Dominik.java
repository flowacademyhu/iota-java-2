package hu.flowacademy.lecture8.prisonBreak.prisoners;

import hu.flowacademy.lecture8.prisonBreak.Borton;
import hu.flowacademy.lecture8.prisonBreak.Bortontoltelek;

public class Dominik extends Bortontoltelek {

    public boolean kapcsoltam = false;

    @Override
    public String neve() {
        return "Dominik";
    }
    @Override
    public boolean voltKintMindenki() {
        if (!Borton.lampaVilagit() && !kapcsoltam) {
            Borton.lampaFelkapcsol();
            kapcsoltam = true;
        }
        return false;
    }
}

