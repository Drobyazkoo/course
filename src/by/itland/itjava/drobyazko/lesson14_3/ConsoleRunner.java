package by.itland.itjava.drobyazko.lesson14_3;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Var result = null;
        try {
            result = parser.calculate(input);
            System.out.println(result);
        } catch (CalcException e) {
            System.err.println(e.getMessage());
        }

    }
}
