package task;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

public class Counter {

    public static Integer sumOfNonNullNumbers(Collection<Integer> integers) {
        Predicate<Integer> predicate = Objects::nonNull;
        return integers.stream().mapToInt(integer -> integer).sum();
    }

}