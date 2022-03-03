package by.itland.itjava.drobyazko.lesson15;

public class MyClassGeneric<T> {
    T a;
    T b;

    @Override
    public String toString() {
        return "MyClassGeneric{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public MyClassGeneric(T a, T b) {
        this.a = a;
        this.b = b;
    }
}
