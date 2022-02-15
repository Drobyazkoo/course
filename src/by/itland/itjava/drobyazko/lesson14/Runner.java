package by.itland.itjava.drobyazko.lesson14;

public class Runner {
    public static void main(String[] args) {
        Var scalar = new Scalar("5");
        Var scalar2 = new Scalar("5");
        Var vector  = new Vector("{1, 2, 3}");
        Var vector2  = new Vector("{1, 2, 3}");
        System.out.println(scalar.add(scalar2));
        System.out.println(scalar.mull(scalar2));
        System.out.println(scalar.sub(scalar2));
        System.out.println(scalar.div(scalar2));

        System.out.println(vector.add(scalar2));
        System.out.println(vector.mull(scalar2));
        System.out.println(vector.sub(scalar2));
        System.out.println(vector.div(scalar2));

        System.out.println(vector.add(vector2));
        System.out.println(vector.mull(vector2));
        System.out.println(vector.sub(vector2));
        System.out.println(vector.div(vector2));

        System.out.println(scalar.add(vector2));
        System.out.println(scalar.mull(vector2));
        System.out.println(scalar.sub(vector2));
        System.out.println(scalar.div(vector2));
    }
}
