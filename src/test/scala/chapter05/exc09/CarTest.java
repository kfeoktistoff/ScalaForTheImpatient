package chapter05.exc09;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

public class CarTest {
    @Test
    public void testGetYear() {
        assertEquals(2014, new Car("Honda", "Accord", 2014).getYear());
    }

    @Test
    public void testGetVin() {
        assertEquals("a123", new Car("Honda", "Accord", "a123").getVin());
    }

    @Test
    public void testGetCreator() {
        assertEquals("Honda", new Car("Honda", "Accord").getCreator());
    }

    @Test
    public void testGetModel() {
        assertEquals("Accord", new Car("Honda", "Accord").getModel());
    }

    @Test
    public void testDefaultYear() {
        assertEquals(-1, new Car("Honda", "Accord").getYear());
    }

    @Test
    public void testDefaultVin() {
        assertEquals("", new Car("Honda", "Accord").getVin());
    }
}
