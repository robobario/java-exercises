package task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Container {
    // note that an arraylist is not a fixed size, it resizes as required when items are added
    private static final Collection<Integer> list = new ArrayList<>();
    private static final Collection<Integer> list2 = new LinkedList<>();

    // this is a static initializer block to make some method calls after constructing static fields
    static {
        list.add(1);
        list.add(2);

        list2.add(3);
        list2.add(4);
        list2.add(5);
    }

    public static Collection<Integer> concat(){
        ArrayList<Integer> result = new ArrayList<>();
        // add things to result
        return result;
    }

}