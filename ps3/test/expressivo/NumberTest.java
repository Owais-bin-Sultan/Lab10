package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberTest {

    // Test for NumberExpression
    @Test
    public void testNumberExpression() {
        Expression exp1 = new Number(3.7592);
        Expression exp2 = new Number(3.7592);
        Expression exp3 = new Number(5.2475);
        
        // Test toString
        assertEquals("3.7592", exp1.toString());
        
        // Test equals
        assertTrue(exp1.equals(exp2));  // Same values
        assertFalse(exp1.equals(exp3)); // Different values
        
        // Test hashCode
        assertEquals(exp1.hashCode(), exp2.hashCode());
        assertNotEquals(exp1.hashCode(), exp3.hashCode());
    }
}
