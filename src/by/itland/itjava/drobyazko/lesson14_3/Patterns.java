package by.itland.itjava.drobyazko.lesson14_3;

public class Patterns {
    private Patterns(){ }

    static  final String OPERATION = "[-*+/]";
    static final String SCALAR = "-?(\\s*)?\\d+(\\s*)?(\\.\\d+)?";
    static final String VECTOR = "\\{((-?\\d+(\\.\\d+)?)(,?))+}";
    // "{-5.25,4,6,8}"
    static final String MATRIX = "\\{(\\{((-?\\d+(\\.\\d+)?)(,?))+}(,?))+}";
    //{{1,2,3},{4,5,6},{-4.25,8,3}}
}
