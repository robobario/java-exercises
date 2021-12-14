package task;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Counter {

    public static Integer sumOfOddNumbers(Collection<Integer> integers) {
        Stream<Integer> stream = integers.stream();
        Stream<Integer> integerStream = stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return true;
            }
        });
        IntStream intStream = integerStream.mapToInt(integer -> integer);
        return intStream.sum();
    }

}