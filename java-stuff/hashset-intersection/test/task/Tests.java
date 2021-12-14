package task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testSolution() {
        HashSet<Integer> expected = new HashSet<>();
        expected.add(2);
        assertEquals(expected, Container.intersection(), "Container.concat() did not equal " + expected);
    }

}