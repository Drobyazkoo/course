package by.itland.itjava.drobyazko.lesson14_3;

public class Scalar extends Var {

    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(String value) {
        this.value = Double.parseDouble(value);
    }

    public Scalar(Scalar scalar) {
        this.value = scalar.value;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            Scalar operand2 = (Scalar) other;
            double result = this.value + operand2.value;
            return  new Scalar(result);
        }
        return other.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar){
            Scalar operand2 = (Scalar) other;
            double result = this.value - operand2.value;
            return  new Scalar(result);
        }
        return other.sub(other);
    }

    @Override
    public Var mull(Var other) {
        if (other instanceof Scalar){
            Scalar operand2 = (Scalar) other;
            double result = this.value * operand2.value;
            return  new Scalar(result);
        }
        return other.mull(other);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar){
            Scalar operand2 = (Scalar) other;
            double result = this.value / operand2.value;
            return  new Scalar(result);
        }
        return other.div(other);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
