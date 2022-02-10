package by.itland.itjava.naumenko.lesson13;

public class Runner {

    public static void main(String[] args) {

        Scalar scalar1 = new Scalar(5.6);
        Scalar scalar2 = new Scalar("5.6");
        Scalar scalar3 = new Scalar(scalar2);

        System.out.println(scalar1);
        System.out.println(scalar2);
        System.out.println(scalar3);


        Vector vector = new Vector(new double[]{1, 2, 3, 4});
        Vector vector2 = new Vector("{1, 2, 3, 4}");
        Vector vector3 = new Vector(vector2);

        System.out.println(vector);
        System.out.println(vector2);
        System.out.println(vector3);

    }
}
