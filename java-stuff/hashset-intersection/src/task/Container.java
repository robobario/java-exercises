package task;

import java.util.*;

public class Container {

    // change to a HashSet
    private static final Collection<Integer> set = new HashSet<>();
    private static final Collection<Integer> set2 = new HashSet<>();

    // this is a static initializer block to make some method calls after constructing static fields
    static {
        set.add(1);
        set.add(2);

        set2.add(2);
        set2.add(3);
    }

    public static Collection<Integer> intersection(){
        return new HashSet<>(set);
    }

}