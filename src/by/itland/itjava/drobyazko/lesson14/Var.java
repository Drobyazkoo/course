package by.itland.itjava.drobyazko.lesson14;

public abstract class Var implements Operation{
    @Override
    public Var add(Var other) {
        System.out.println("Error");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Error");
        return null;
    }

    @Override
    public Var mull(Var other) {
        System.out.println("Error");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Error");
        return null;
    }

    @Override
    public String toString() {
        return "Я Var";
    }
}