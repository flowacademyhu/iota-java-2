package hu.flowacademy.lecture6.stream.generator;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.*;

public class Generator {
    public static void main(String[] args) {
        // hozzunk létre VÉGTELEN streameket
        Stream<Integer> fiveOrSix = Stream.generate(() -> {
            if (System.currentTimeMillis() % 2 == 0) {
                return 6;
            } else {
                return 5;
            }
        });
        // Limitáljuk: .limit(10);

        // hozzunk létre egy olyan streamet, ami random számokat generál
        Stream<Integer> randomInts = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);
        randomInts.forEach(System.out::println);

        // Feladat: írjatok olyan stream generátort, ami 10 random páros számot generál!
        // Hint: páros * páros = páros, páratlan * páros = páros
        System.out.println();
        Stream
                .generate(() -> (int) (Math.random() * 100))
                .filter(i -> i % 2 == 0)
                .limit(10)
                .forEach(i -> System.out.println(i));

        System.out.println();
        Stream
                .generate(() -> ((int) (Math.random() * 100)) * 2)
                .limit(10)
                .forEach(i -> System.out.println(i));

        System.out.println();
        Stream
                .generate(() -> {
                    int n;
                    while ((n = (int) Math.random() * 100) % 2 != 0) {

                    }
                    return n;
                });
        System.out.println();
        // Feladat: írjunk egy olyan stream generátort, ami visszaadja a következő prímszámot!
        Stream.iterate(2, (previous) -> {
            boolean nextPrimeFound = false;
            while (!nextPrimeFound) {
                previous++;
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(previous); i++) {
                    if (previous % i == 0) {
                        // ez a szám (previous) biztos, hogy nem prím
                        isPrime = false;
                        break;
                    }
                }
                // ezen a ponton tudjuk, hogy az adott számnak nincs osztója
                if (isPrime) {
                    nextPrimeFound = true;
                }
            }
            return previous;
        })
                .limit(10)
                .forEach(prime -> {
                    System.out.println(prime);
                });

        // Feladat: Fibonacci-sorozat
        // első eleme = 1, második eleme = 1
        // következő elem = előző + előző előtti
        Stream.iterate(new int[]{1, 1}, (arr) -> arr);

        System.out.println();
        // Feladat: faktoriális
        // ezt nem fogjuk tudni iterate()-tel megoldani
        Stream.iterate(ZERO, i -> i.add(ONE))
                .limit(500)
                .forEach(number -> {
                    System.out.println(MathUtils.factorial(number));
                });

        //for (int i = 0; i < 11; i++) {
        //    System.out.println(i + "! = " + MathUtils.factorial(i));
        // }
    }
}

class MathUtils {
    static BigInteger factorial(BigInteger num) {
        BigInteger fact = ONE; // immutable
        // compareTo akkor ad vissza 0-t, ha a két objektum egyenlő
        for (BigInteger i = TWO; i.compareTo(num) <= 0; i = i.add(ONE)) {
            fact = fact.multiply(i); // fact *= i;
        }
        return fact;
    }
}
