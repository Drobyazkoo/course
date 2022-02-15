package by.itland.itjava.timshina.lesson14;



public class Scalar extends Var {

    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Scalar (double value){
        this.value = value;
    }
    public Scalar (String value){
        this.value = Double.parseDouble(value);
    }
    public Scalar(Scalar scalar){
        this.value = scalar.value;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double result = this.value + operand2.value;
            return new Scalar(result);
        }
        return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double result = this.value - operand2.value;
            return new Scalar(result);
        }
        return other.add(this);

    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double result = this.value * operand2.value;
            return new Scalar(result);
        }
        return other.add(this);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double result = this.value / operand2.value;
            return new Scalar(result);
        }
        return other.add(this);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
