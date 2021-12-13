package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testSolution() {
        String a = "marmite";
        String b = "marmite";
        String c = new String("marmite");
        assertTrue(EqualityChecker.equals(a, b), a + " did not equal the string literal -> " + b);
        assertTrue(EqualityChecker.equals(a, c), a + " did not equal the new String -> " + c);
    }
}