package by.itland.itjava.timshina.lesson11;

public class Shelf extends Furniture{
    private int seg;
    private int sizeSeg;

    public Shelf() {
    }

    public Shelf(String name, int size, int price, int seg, int sizeSeg) {
        super(name, size, price);
        this.seg = seg;
        this.sizeSeg = sizeSeg;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getSizeSeg() {
        return sizeSeg;
    }

    public void setSizeSeg(int sizeSeg) {
        this.sizeSeg = sizeSeg;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "name=" + getName() +
                " size" + getSize() +
                " price" + getPrice() +
                "seg=" + seg +
                ", sizeSeg=" + sizeSeg +
                '}';
    }
}
