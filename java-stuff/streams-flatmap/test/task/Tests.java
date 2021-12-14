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
        integerList.add(2);

        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(3);
        integerList1.add(4);

        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(5);
        integerList2.add(6);
        String message = "result did not equal the sum of all the odd numbers in the list";
        try {
            assertEquals(21, Counter.sumAll(integerList, integerList1, integerList2), message);
        } catch (NullPointerException e){
            fail("sumOfNonNullNumbers threw NullPointerException, we need to filter out nulls");
        }
    }
}