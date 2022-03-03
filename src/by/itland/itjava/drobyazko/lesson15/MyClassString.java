package by.itland.itjava.drobyazko.lesson15;

public class MyClassString {
    String a;
    String b;

    public MyClassString(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyClassString{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
