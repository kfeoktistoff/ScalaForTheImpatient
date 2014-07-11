package chapter15.exc04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kirill Feoktistov on 11.07.14
 */

public class AccumulatorTest {
    @Test
    public void testSum() {
        Accumulator accumulator = new Accumulator();
        assertEquals(accumulator.sum(1, 2, 3, 4), 10);
    }
}
