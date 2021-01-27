package prisonBreak.prisoners;

import hu.flowacademy.lecture8.prisonBreak.Borton;
import hu.flowacademy.lecture8.prisonBreak.Bortontoltelek;

public class MateBT extends Bortontoltelek {
    private boolean kapcsoltamEMarFel = false;

    @Override
    public String neve() {
        return "Mate";
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