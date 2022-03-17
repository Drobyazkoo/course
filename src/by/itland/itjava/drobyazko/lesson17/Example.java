package by.itland.itjava.drobyazko.lesson17;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            System.out.println(i/j);
        }
        catch (Exception e){
            System.out.println("что-то");
        }
        finally {
            System.out.println("сработал finally");
        }
    }
}
