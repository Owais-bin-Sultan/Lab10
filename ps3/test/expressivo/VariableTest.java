package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

public class VariableTest {

    // Test for VariableExpression
    @Test
    public void testVariableExpression() {
        Expression exp1 = new Variable("a");
        Expression exp2 = new Variable("b");
        Expression exp3 = new Variable("a");
        
        // Test toString
        assertEquals("a", exp1.toString());
        
        // Test equals
        assertTrue(exp1.equals(exp3));
        assertFalse(exp1.equals(exp2));
        
        // Test hashCode
        assertEquals(exp1.hashCode(), exp3.hashCode());
        assertNotEquals(exp1.hashCode(), exp2.hashCode());
    }
}
