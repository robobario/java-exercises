package task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testSolution() {
        HashSet<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, Container.setOfUniqueValues(), "Container.concat() did not equal " + expected);
    }

}