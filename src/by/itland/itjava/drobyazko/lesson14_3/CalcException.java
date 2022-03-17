package by.itland.itjava.drobyazko.lesson14_3;

public class CalcException extends Exception {
    private String message;

    public CalcException() {
        this.message = "Проверьте вводимый формат";
    }
    public CalcException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
