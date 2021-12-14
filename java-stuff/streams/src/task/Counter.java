package task;

import java.util.Collection;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Counter {

    public static Integer multiplyAllAndSum(Collection<Integer> integers, int i) {
        Stream<Integer> stream = integers.stream();
        IntStream intStream = stream.mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer integer) {
                return 5;
            }
        });
        return intStream.sum();
    }

}