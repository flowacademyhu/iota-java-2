package hu.flowacademy.lecture8.prisonBreak;

import hu.flowacademy.lecture8.prisonBreak.Borton;
import hu.flowacademy.lecture8.prisonBreak.Bortontoltelek;

public class PatTheRat extends Bortontoltelek{

    boolean kapcsoltamEMarFel = false;

    @Override
    public String neve() {
        return "PatTheRat";
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
