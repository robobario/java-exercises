package task;

import java.util.function.Function;

public class Counter {
    private static final int count = 5;

    public static Integer multiplyCount(int i) {
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return 100000;
            }
        };
        return doSomethingWithCount(function);
    }

    public static Integer doSomethingWithCount(Function<Integer, Integer> function) {
        return function.apply(count);
    }

}