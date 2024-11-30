package expressivo;

public class Variable implements Expression {
    private final String variable;

    public Variable(String variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return variable;
    }

    @Override
    public boolean equals(Object thatObject) {
        if (!(thatObject instanceof Variable)) {
            return false;
        }
        Variable that = (Variable) thatObject;
        return this.variable.equals(that.variable);
    }

    @Override
    public int hashCode() {
        return variable.hashCode();
    }
}
