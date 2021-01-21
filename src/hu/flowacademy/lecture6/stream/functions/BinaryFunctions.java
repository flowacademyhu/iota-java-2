 package hu.flowacademy.lecture6.stream.functions;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.ToDoubleBiFunction;

public class BinaryFunctions {
    public static void main(String[] args) {
        // Ha két paramétert fogadunk, akkor az BiFunction lesz
        // Btw, Java 11 óta lehet használni String.repeat-et is
        // String s1 = "ez egy string".repeat(9999);
        BiFunction<String, Integer, String> repeat = (s, n) -> {
            StringBuilder repeated = new StringBuilder();
            for (int i = 0; i < n; i++) {
                repeated.append(s);
            }
            return repeated.toString();
        };

        // Ekkor a következőképp futtahatjuk:
        System.out.println(repeat.apply("foo", 13));

        // Beépített ToDoubleBiFunction segítségével mértani közép
        ToDoubleBiFunction<Integer, Integer> geometricMean = (a, b) -> Math.sqrt(a * b);
        System.out.println(geometricMean.applyAsDouble(2, 8));

        // BinaryOperator - XOR operátor függvényként
        BinaryOperator<Integer> xor = (a, b) -> a ^ b;
        // 1 1 0 0 1 0
        // 0 1 1 0 0 0
        // 1 0 1 0 1 0
        System.out.println(xor.apply(50, 24));

        // BinaryOperator 2 - LNKO (Euklideszi alg.)
        BinaryOperator<Integer> lnko = (a, b) -> {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        };
        System.out.println(lnko.apply(12896, 169));

        // BiPredicate - többszöröse-e egymásnak a két szám
        BiPredicate<Integer, Integer> isMultiplicative = (a,b) -> a > b ? a % b == 0 : b % a == 0;
        System.out.println(isMultiplicative.test(12, 48));
        System.out.println(isMultiplicative.test(96, 13));

        // BiPredicate: mondjuk meg, hogy az első szám, nagyobb-e, mint a második
        BiPredicate<Integer, Integer> isFirstBigger = (a, b) -> a > b;

        // BiPredicate: mondjuk meg, a stringnek része-e az int paraméter
        // pl: str = "1984", n = 4
        BiPredicate<String, Integer> contains = (str, n) -> str.contains(Integer.toString(n));
        System.out.println(contains.test("1984", 4));


    }

}
