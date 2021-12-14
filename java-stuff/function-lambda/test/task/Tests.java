package task;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testSolution() {
        assertEquals(50, Counter.multiplyCount(10), "multiplyCount did not multiple by 10 correctly");
        assertEquals(100, Counter.multiplyCount(20), "multiplyCount did not multiple by 20 correctly");
    }
}