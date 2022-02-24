package by.itland.itjava.drobyazko.lesson14_3;

public abstract class Var implements Operation{
    @Override
    public Var add(Var other) {
        System.out.println("Error: сложение" + this.getClass().getSimpleName() + "невозможна с" +
                other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Error: вычитание" + this.getClass().getSimpleName() + "невозможна с" +
                other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var mull(Var other) {
        System.out.println("Error: произведение" + this.getClass().getSimpleName() + "невозможна с" +
                other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Error: частное" + this.getClass().getSimpleName() + "невозможна с" +
                other.getClass().getSimpleName());
        return null;
    }

    public static Var createVar(String operand){
        if(operand.matches(Patterns.SCALAR))
            return new Scalar(operand);

        else if(operand.matches(Patterns.VECTOR))
            return new Vector(operand);

        else if(operand.matches(Patterns.MATRIX))
            return new Matrix(operand);

        return null;

    }

    @Override
    public String toString() {
        return "Я Var";
    }
}
