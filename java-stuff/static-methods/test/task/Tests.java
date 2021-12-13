package task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void testSolution() {
        int i = NumberSack.sum();
        Assertions.assertEquals(12, i);
    }
}