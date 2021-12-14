package task;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Counter {

    public static Integer sumAll(Collection<Integer> ... integers) {
        Stream<Collection<Integer>> stream = Arrays.stream(integers);
        Stream<Integer> integerStream = stream.flatMap(ints -> Stream.of(1));
        IntStream intStream = integerStream.mapToInt(integer -> integer);
        return intStream.sum();
    }

}