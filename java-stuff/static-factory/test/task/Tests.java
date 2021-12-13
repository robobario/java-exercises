package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testSolution() {
        Jar jar1 = Jar.create(2);
        Jar jar2 = Jar.create(2);
        Jar jar3 = Jar.create(3);
        Jar jar4 = Jar.create(3);

        assertSame(jar1, jar2, "jar1 is not the same as jar2");
        assertNotSame(jar2, jar3, "jar2 is the same as jar3");
        assertSame(jar3, jar4, "jar3 is not the same as jar4");
    }
}