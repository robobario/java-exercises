package task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Tests {
    @Test
    public void testSolution() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(null);
        integerList.add(3);
        integerList.add(null);
        String message = "result did not equal the sum of all the odd numbers in the list";
        try {
            assertEquals(4, Counter.sumOfNonNullNumbers(integerList), message);
        } catch (NullPointerException e){
            fail("sumOfNonNullNumbers threw NullPointerException, we need to filter out nulls");
        }
    }
}