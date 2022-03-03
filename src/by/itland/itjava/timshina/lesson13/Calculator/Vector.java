package by.itland.itjava.timshina.lesson13.Calculator;

import java.util.Arrays;

public class Vector extends Var{
    private double[] value;

    public Vector (double[] value){
        this.value = value;
    }

    public Vector(String value){
        String s = value.replaceAll("[{,}]", " ");
        s = s.trim();
        String[] split = s.split("\\s+");
        double[] arr = new double [split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(split[i]);
        }
        this.value = arr;
    }
    public Vector (Vector vector){
        this.value = vector.value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        String del = "";
        for (int i = 0; i < value.length; i++) {
            stringBuilder.append(del).append(value[i]);
            del = ", ";
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
