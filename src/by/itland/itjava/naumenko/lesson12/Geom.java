package by.itland.itjava.naumenko.lesson12;

public abstract class Geom {

    private String color;
    private int width;
    abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
