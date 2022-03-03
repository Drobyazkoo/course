package by.itland.itjava.drobyazko.lesson15;

public class MyClassDouble {
    Double a;
    Double b;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyClassDouble{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
