package task;

import java.util.Collection;
import java.util.function.Predicate;

public class Counter {

    public static Integer sumOfOddNumbers(Collection<Integer> integers) {
        return integers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return true;
            }
        }).mapToInt(integer -> integer).sum();
    }

}