package hu.flowacademy.lecture5.method;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    static List<Integer> mutableCopy(List<Integer> numbers) {
        List<Integer> copyOfNumbers = new ArrayList<>(numbers); // mutable
        return copyOfNumbers;
    }

    static List<Integer> immutableCopy(List<Integer> numbers) {
        List<Integer> copyOfNumbers = List.copyOf(numbers); // immutable
        return copyOfNumbers;
    }

    static void sort(int[] array) {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        copy[0] = -1;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));
        Arrays.sort(copy);
    }

    static long factorial(Integer n) {
        Objects.requireNonNull(n);
        // Integer (wrapper objektum)
        // int (primitív típus)
        if (n < 0) { // Integer objectet hasonlítok össze egy primtívvel -> autoboxing
            throw new IllegalArgumentException("n nem lehet negatív szám");
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
