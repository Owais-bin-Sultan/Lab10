package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void testAdditionExpression() {
        Expression expression1 = new Number(4);
        Expression expression2 = new Number(6);
        Expression addExpr1 = new Addition(expression1, expression2);
        Expression addExpr2 = new Addition(expression2, expression1);

        // Test toString
        assertEquals("4.0000+6.0000", addExpr1.toString());
        
        // Test equals
        assertFalse(addExpr1.equals(addExpr2));
        assertTrue(addExpr1.equals(new Addition(expression1, expression2)));
        
        // Test hashCode
        assertNotEquals(addExpr1.hashCode(), addExpr2.hashCode());
    }
}
