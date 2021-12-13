package task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Container {

    // change to a HashSet
    private static final Collection<Integer> set = new ArrayList<>();

    // this is a static initializer block to make some method calls after constructing static fields
    static {
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
    }

    public static Collection<Integer> setOfUniqueValues(){
        return set;
    }

}