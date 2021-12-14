package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testSolution() {
        Counter counter = new Counter();
        Runnable bumper = counter.getBumper();
        bumper.run();
        bumper.run();
        assertEquals(Counter.getCount(), 2, "jar1 hashcode does not equal jar2 hashcode");
    }
}