package by.itland.itjava.timshina.lesson11;

public class Table extends Furniture{
    private int klegs;
    private double square;

    public Table() {
    }

    public Table(String name, int size, int price, int klegs, double square) {
        super(name, size, price);
        this.klegs = klegs;
        this.square = square;
    }

    public int getKlegs() {
        return klegs;
    }

    public void setKlegs(int klegs) {
        this.klegs = klegs;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name=" + getName() +
                " size" + getSize() +
                " price" + getPrice() +
                "klegs=" + klegs +
                ", square=" + square +
                '}';
    }
}
