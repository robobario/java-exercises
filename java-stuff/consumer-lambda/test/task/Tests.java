package task;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testSolution() {
        Counter counter = new Counter();
        Consumer<Integer> bumper = counter.getBumper();
        bumper.accept(1);
        bumper.accept(2);
        assertEquals(Counter.getCount(), 3, "jar1 hashcode does not equal jar2 hashcode");
    }
}