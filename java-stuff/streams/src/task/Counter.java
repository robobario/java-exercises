package task;

import java.util.Collection;
import java.util.function.ToIntFunction;

public class Counter {

    public static Integer multiplyAllAndSum(Collection<Integer> integers, int i) {
        return integers.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer integer) {
                return 5;
            }
        }).sum();
    }

}