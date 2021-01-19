package hu.flowacademy.lecture5.factorial;

public class Factorial {
    public static void main(String[] args) {
        long fact = factorial(5);
        System.out.println(fact);
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
