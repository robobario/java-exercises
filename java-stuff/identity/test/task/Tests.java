package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testSolution() {
        Jar jar1 = new Jar("marmite");
        Jar jar2 = new Jar("marmite");
        assertFalse(jar1 == jar2, "jar1 was unexpectedly the same object as jar2");
        assertTrue(jar1.equals(jar2), "jar1 did not equal jar2");
        assertEquals(jar1.hashCode(), jar2.hashCode(), "jar1 hashcode does not equal jar2 hashcode");
    }
}