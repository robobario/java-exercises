package task;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Counter {
    private static int count;

    public static Supplier<Integer> getCountSupplier() {
        return () -> 10000;
    }

    public Consumer<Integer> getBumper(){
        return integer -> {
            count += integer;
        };
    }
}