package hu.flowacademy.lecture8.prisonBreak.prisoners;

import hu.flowacademy.lecture8.prisonBreak.Borton;
import hu.flowacademy.lecture8.prisonBreak.Bortontoltelek;

public class TTrab extends Bortontoltelek {

    private static int index = 0;

    @Override
    public String neve() {
        return "Trab";
    }

    @Override
    public boolean voltKintMindenki() {

        if (Borton.lampaVilagit()) {
            Borton.lampaLekapcsol();
            index++;
        }

        if (Borton.foglyokSzama() == index) {
            return true;
        }

        return false;
    }
}