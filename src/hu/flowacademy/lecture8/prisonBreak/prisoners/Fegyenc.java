package hu.flowacademy.lecture8.prisonBreak.prisoners;

import hu.flowacademy.lecture8.prisonBreak.Borton;
import hu.flowacademy.lecture8.prisonBreak.Bortontoltelek;

public class Fegyenc extends Bortontoltelek {
    public boolean kapcsoltam = false;

    @Override
    public String neve() {
        return "Zorán";
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
