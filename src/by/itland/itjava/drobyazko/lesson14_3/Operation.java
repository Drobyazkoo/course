package by.itland.itjava.drobyazko.lesson14_3;

public interface Operation {

    Var add(Var other) throws CalcException;

    Var sub(Var other)throws CalcException;

    Var mull(Var other)throws CalcException;

    Var div(Var other)throws CalcException;
}
