package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {

    // Test for MultiplicationExpression
    @Test
    public void testMultiplicationExpression() {
        Expression exp1 = new Number(5);
        Expression exp2 = new Number(10);
        Expression multExpr1 = new Multiplication(exp1, exp2);
        Expression multExpr2 = new Multiplication(exp2, exp1);
        Expression exp3 = new Number(60);

        // Test toString
        assertEquals("5.0000*10.0000", multExpr1.toString());

        // Test equals (order matters in multiplication)
        assertTrue(multExpr1.equals(multExpr2));  // Multiplication is commutative
        assertTrue(multExpr1.equals(new Multiplication(exp1, exp2))); // Same order
        assertFalse(multExpr1.equals(new Multiplication(exp1, exp3))); // Different values

        // Test hashCode
        assertEquals(multExpr1.hashCode(), multExpr2.hashCode());  // Commutative property
        assertNotEquals(multExpr1.hashCode(), new Multiplication(exp1, exp3).hashCode());
    }
}
