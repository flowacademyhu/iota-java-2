package hu.flowacademy.lecture8.prisonBreak.prisoners;

import hu.flowacademy.lecture8.prisonBreak.Borton;
import hu.flowacademy.lecture8.prisonBreak.Bortontoltelek;

public class Barbi extends Bortontoltelek {

    private boolean kapcsoltamEMarFel = false;
    @Override
    public String neve() {
        return "Barbi";
    }
    @Override
    public boolean voltKintMindenki() {
        if (!Borton.lampaVilagit() && !kapcsoltamEMarFel) {
            Borton.lampaFelkapcsol();
            kapcsoltamEMarFel = true;
        }
        return false;
    }
}
