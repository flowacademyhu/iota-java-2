package hu.flowacademy.lecture6.stream.functions;

import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class UnaryFunctions {
    public static void main(String[] args) {
        // Ezek a függvények egy paramétert fogadnak

        // Pl. ez a függvény Stringből képez Integert (megszámolja a magánhangzókat)
        Function<String, Integer> countVowels = (str) -> {
            int numberOfVowels = 0;
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            for (char c : str.toCharArray()) {
                if(vowels.contains(c)) {
                    numberOfVowels++;
                }
            }
            return numberOfVowels;
        };

        // Itt is vannak specializációk:
        // Ez a függvény pl. n reciprokát számolja ki
        IntFunction<Double> reciprocal = r -> Math.pow(r, -1);

        // Vagy ToIntFunction, ami egy string hosszát adja vissza
        ToIntFunction<String> length = String::length;

        // A Predicate<T> booleant ad vissza: ha a paraméter (n) 42, akkor true
        Predicate<Integer> isMeaningOfLife = n -> n == 42;

        // ezeket a függvényeket .apply()-jal tudjuk meghívni
        System.out.println(countVowels.apply("there are 9 vowels in this string"));

        System.out.println(reciprocal.apply(10));

        System.out.println(length.applyAsInt("the length is 16"));

        // Predicate esetében .test()
        System.out.println(isMeaningOfLife.test(42));
    }
}
