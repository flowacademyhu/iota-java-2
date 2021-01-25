package hu.flowacademy.lecture8.prisonBreak.prisoners;

import hu.flowacademy.lecture8.prisonBreak.Bortontoltelek;

import java.util.Random;

public class MintaElek extends Bortontoltelek {
    @Override
    public String neve() {
        return "Minta Elek";
    }

    @Override
    public boolean voltKintMindenki() {
        return new Random().nextBoolean();
    }
}
