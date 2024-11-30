package expressivo;

public class Multiplication implements Expression {
    private final Expression op1;
    private final Expression op2;

    public Multiplication(Expression operand1, Expression operand2) {
        this.op1 = operand1;
        this.op2 = operand2;
    }

    @Override
    public String toString() {
        return op1.toString() + "*" + op2.toString();
    }

    @Override
    public boolean equals(Object thatObject) {
        if (!(thatObject instanceof Multiplication)) {
            return false;
        }
        Multiplication that = (Multiplication) thatObject;
        return (this.op1.equals(that.op1) && this.op2.equals(that.op2)) ||
               (this.op1.equals(that.op2) && this.op2.equals(that.op1));
    }

    @Override
    public int hashCode() {
        int leftHash = op1.hashCode();
        int rightHash = op2.hashCode();
        return 31 * Math.min(leftHash, rightHash) + Math.max(leftHash, rightHash);
    }
}
