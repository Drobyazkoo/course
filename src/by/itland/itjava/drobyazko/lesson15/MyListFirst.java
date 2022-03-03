package by.itland.itjava.drobyazko.lesson15;

import java.util.Arrays;

public class MyListFirst <T> {
    private T[] array;
    private int capacity;

    public MyListFirst() {
        this.array = (T[]) new Object[]{};
    }


    public boolean add(T element){
        T[] newArr = (T[]) new Object[capacity+1];
        for (int i = 0; i < array.length ; i++) {
            newArr[i] = array[i];

        }
        newArr[capacity++] = element;
        array= newArr;
        return true;
    }
    public T get (int index){
        return array[index];
    }
    public void remove(int index){
        T[] newArr = (T[]) new Object[capacity -1];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        for (int i = index; i < newArr.length ; i++) {
            newArr[i] = array[i+1];

        }
        array = newArr;
        capacity--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String del = "";
        for (int i = 0; i < array.length; i++) {

            sb.append(del).append(array[i]);
            del=", ";
//            if (i<(array.length-1))
//                sb.append(", ");
        }
        return sb.append("]").toString();

    }
}
