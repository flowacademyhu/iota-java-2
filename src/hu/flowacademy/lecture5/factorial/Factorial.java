package hu.flowacademy.lecture5.factorial;

// FIXME: this class contains an error that will be fixed soon
public class Factorial {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i < n; i++) {
            fact *= i;
        }
        return fact;
    }
}
