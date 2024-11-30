package expressivo;

/**
 * Represents the addition operation in the expression.
 */
public class Addition implements Expression {
    private final Expression op1;
    private final Expression op2;

    public Addition(Expression op1, Expression op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public String toString() {
        return op1.toString() + "+" + op2.toString();
    }

    @Override
    public boolean equals(Object thatObject) {
        if (!(thatObject instanceof Addition)) {
            return false;
        }
        Addition that = (Addition) thatObject;
        return this.op1.equals(that.op1) && this.op2.equals(that.op2);
    }

    @Override
    public int hashCode() {
        return 31 * op1.hashCode() + op2.hashCode();
    }
}
