package by.itland.itjava.drobyazko.lesson17;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class DogComparator implements Comparator<Dog> {
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int compare (Dog o1, Dog o2){
    return Integer.compare(o1.getAge(), o2.getAge());
    }

}
