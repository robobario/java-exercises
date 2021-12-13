package task;

import java.util.ArrayList;
import java.util.Collection;

public class Container<T> {
    // note that an arraylist is not a fixed size, it resizes as required when items are added
    private static final Collection<Integer> list = new ArrayList<>();

    // this is a static initializer block to make some method calls after constructing static fields
    static {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

    public static int sum(){
        int sum = 0;
        // do something!
        return sum;
    }

}