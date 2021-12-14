package task;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Counter {

    public static Integer sumOfNonNullNumbers(Collection<Integer> integers) {
        Predicate<Integer> predicate = Objects::nonNull;
        Stream<Integer> stream = integers.stream();
        IntStream intStream = stream.mapToInt(integer -> integer);
        return intStream.sum();
    }

}