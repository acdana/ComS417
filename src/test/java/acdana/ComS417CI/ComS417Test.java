package acdana.ComS417CI;

import acdana.ComS417CI.ComS417;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class ComS417Test extends TestCase {


    public void testAddNumbers()
    {
    	int num1 = 5;
    	int num2 = 3;
    	int expectedTotal = 8;
        assertEquals(expectedTotal, ComS417.addNumbers(num1, num2));
    }
    
}
