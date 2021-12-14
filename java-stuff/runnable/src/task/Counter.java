package task;

public class Counter {
    private static int count;

    public static int getCount() {
        return count;
    }

    public Runnable getBumper(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // do a thing
            }
        };
        return runnable;
    }
}