package task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.ToIntFunction;

public class Counter {
    private static final List<Integer> integerList = new ArrayList<>();
    static {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
    }

    public static Integer multiplyAllAndSum(Collection<Integer> integers, int i) {
        return integerList.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer integer) {
                return 5;
            }
        }).sum();
    }

}