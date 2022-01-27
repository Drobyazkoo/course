package by.itland.itjava.timshina.lesson11;

public class Wardroab extends Furniture{
    private String material;
    private int doors;
    private int miniwardroabs;

    public Wardroab() {
    }

    public Wardroab(String name, int size, int price, String material, int doors, int miniwardroabs) {
        super(name, size, price);
        this.material = material;
        this.doors = doors;
        this.miniwardroabs = miniwardroabs;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getMiniwardroabs() {
        return miniwardroabs;
    }

    public void setMiniwardroabs(int miniwardroabs) {
        this.miniwardroabs = miniwardroabs;
    }

    @Override
    public String toString() {
        return "Wardroab{" +
                "name=" + getName() +
                " size" + getSize() +
                " price" + getPrice() +
                "material='" + material + '\'' +
                ", doors=" + doors +
                ", miniwardroabs=" + miniwardroabs +
                '}';
    }
}
