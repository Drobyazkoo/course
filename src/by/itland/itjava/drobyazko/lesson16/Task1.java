package by.itland.itjava.drobyazko.lesson16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    private List<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        for (int i = 0; i <20; i++) {
            task1.grades.add((int)((Math.random()*10)+1));

        }
        System.out.println(task1.grades);
        task1.clearBad(task1.grades);
        System.out.println(task1.grades);

    }

    private void clearBad(List<Integer> grades) {
        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()){
            if(iterator.next()<4){
                iterator.remove();
            }
        }
    }
}
