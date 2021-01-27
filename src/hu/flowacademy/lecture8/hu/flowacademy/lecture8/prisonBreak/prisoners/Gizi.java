package hu.flowacademy.lecture8.prisonBreak.prisoners;

import hu.flowacademy.lecture8.prisonBreak.Borton;
import hu.flowacademy.lecture8.prisonBreak.Bortontoltelek;

public class Gizi extends Bortontoltelek {

    int kapcsolasokSzama = 0;

    @Override
    public String neve() {
        return "Gizi";
    }

    @Override
    public boolean voltKintMindenki() {
        if (!Borton.lampaVilagit() && kapcsolasokSzama < 1) {
            Borton.lampaFelkapcsol();
        }
        return false;
    }





    //Dont know yet
//    @Override
//    public boolean voltKintMindenki() {
//
//    }
}