package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testSolution() {
        int expected = 1 + 2 + 3 + 4 + 5;
        assertEquals(expected, Container.sum(), "Container.sum() did not equal " + expected);
    }
}