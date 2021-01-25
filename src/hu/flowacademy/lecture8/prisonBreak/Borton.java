package hu.flowacademy.lecture8.prisonBreak;

public final class Borton {
    private static boolean vilagit = false;

    private Borton() {
        // nem engedjük a példányosítást
    }

    public static void lampaFelkapcsol() {
        vilagit = true;
    }

    public static void lampaLekapcsol() {
        vilagit = false;
    }

    public static void lampaAtkapcsol() {
        vilagit = !vilagit;
    }

    public static boolean lampaVilagit() {
        return vilagit;
    }

    public static int foglyokSzama() {
        return 12;
    }
}
