package by.itland.itjava.drobyazko.lesson17;

import by.itland.itjava.materials.lesson16.ArrayListExample;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EqualsExample {
    public static void main(String[] args) {
        Dog tuzik = new Dog("Тузик",5);
        Dog bobik = new Dog("Бобик", 3);
        Dog polkan = new Dog("Полкан", 10);
        Dog tuzik2 = new Dog("Тузик", 5);

        System.out.println(5==3);
        System.out.println(tuzik.equals(tuzik2));
//        System.out.println(tuzik>bobik);

        List<Dog> dogs = new ArrayList<>(){{

            add(tuzik);
            add(bobik);
            add(polkan);
            add(tuzik2);

        }};
        System.out.println(dogs);
        dogs.sort(new DogComparator());
//        dogs.sort(new Comparator<Dog>() {
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        System.out.println(dogs);

    }
}
