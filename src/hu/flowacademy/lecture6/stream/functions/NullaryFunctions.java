package hu.flowacademy.lecture6.stream.functions;

import hu.flowacademy.lecture6.stream.models.Foo;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class NullaryFunctions {
    public static void main(String[] args) {
        // Ezek olyan függvények, amelyeknek nincs bemenő paramétere

        // A legáltalánosabb a Supplier<T>, ennek bármilyen T típust meg lehet adni (itt pl. egy enumot)
        Supplier<Foo> a = () -> Foo.TWO;

        // Van speciálizációja is:
        IntSupplier intSupplier = () -> 42;

        // Van Long és Double is:
        LongSupplier longSupplier = () -> 314159265359L;
        DoubleSupplier e = () -> 2.7182818;

        // Consumer
    }
}

