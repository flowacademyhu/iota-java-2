package hu.flowacademy.lecture8.prisonBreak;

import hu.flowacademy.lecture8.prisonBreak.prisoners.*;
import prisonBreak.prisoners.MateBT;

import java.util.*;

public class PrisonDriver {
    public static void main(String[] args) throws Exception {
        long i = 0;

        Bortontoltelek r1 = new TTrab();
        Bortontoltelek r2 = new Barbi();
        Bortontoltelek r3 = new BigG();
        Bortontoltelek r4 = new Dominik();
        Bortontoltelek r5 = new Fegyenc();
        Bortontoltelek r6 = new Gizi();
        Bortontoltelek r7 = new Karo();
        Bortontoltelek r8 = new MateBT();
        Bortontoltelek r9 = new MelaniBortontoltelek();
        Bortontoltelek r10 = new MiklosBortontoltelek();
        Bortontoltelek r11 = new PatTheRat();
        Bortontoltelek r12 = new AnikoBortontoltelek();
        List<Bortontoltelek> rabok = List.of(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);

        Set<String> rabokSorrendje = new HashSet<>();
        Random random = new Random();

        Bortontoltelek aktualisRab;
        while (true) {
            i++;
            aktualisRab = rabok.get(random.nextInt(rabok.size()));
            rabokSorrendje.add(aktualisRab.neve());
            boolean valasz = aktualisRab.voltKintMindenki();
            if (valasz) {
                break;
            }

        }

        System.out.println(aktualisRab.neve() + " azt mondta, hogy mindenki volt már kint.");
        System.out.println("És hogy igaza van-e?");

        if (rabokSorrendje.size() == Borton.foglyokSzama()) {
            System.out.println("Igen, megmenekültetek a börtöntől! 🎉");
        } else {
            System.out.println("Nem, sajnos mindenkit kivégeznek! 🔫");
        }
        System.out.println("Mindehhez " + i + "-szer kellett kihívni titeket.");
    }

}

