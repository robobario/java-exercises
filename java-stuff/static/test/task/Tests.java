package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testSolution() {
        Jar jar1 = new Jar();
        Jar jar2 = new Jar();

        // note: assertSame is the same as checking if `a == b` is true
        assertSame(jar1.getRandom(), jar2.getRandom(), "jar1 does not contain the same instance of random as jar2");
    }
}