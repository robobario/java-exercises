package task;

import com.sun.tools.javac.util.List;

import java.util.function.Consumer;

public class Counter {
    private static int count;

    public static int getCount() {
        return count;
    }

    public Consumer<Integer> getBumper(){
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        };
        return consumer;
    }
}