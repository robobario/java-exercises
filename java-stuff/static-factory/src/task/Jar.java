package task;

import java.util.HashMap;
import java.util.Map;

public class Jar {
    private int maxSize;
    private static Map<Integer, Jar> jarPool = new HashMap<>();

    private Jar(int maxSize){
        this.maxSize = maxSize;
    }

    public static Jar create(int maxSize){
        return new Jar(maxSize);
    }
}