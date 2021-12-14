package task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void testSolution() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        String message = "result did not equal the sum of all the values in the list multipled by n";
        assertEquals(12, Counter.multiplyAllAndSum(integerList, 2), message);
    }
}