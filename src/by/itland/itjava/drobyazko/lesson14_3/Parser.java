package by.itland.itjava.drobyazko.lesson14_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    //trim удаляет
    //pars разделяет
    public Var calculate(String text) throws CalcException {
        String[] operands = text.trim().split(Patterns.OPERATION);
        Var leftOperand = Var.createVar(operands[0]);
        Var rightOperand = Var.createVar(operands[1]);

        Pattern pattern = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            String operation = matcher.group();
            switch (operation){
                case "+": return leftOperand.add(rightOperand);
                case "*": return leftOperand.mull(rightOperand);
                case "-": return leftOperand.sub(rightOperand);
                case "/": return leftOperand.div(rightOperand);
            }
        }
        throw new CalcException();
    }
}
