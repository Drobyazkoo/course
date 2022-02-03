package by.itland.itjava.materials.lesson12;

public class RunnerGeom {
    public static void main(String[] args) {
        Geom[] geoms = new Geom[3];
        geoms[0] = new Line();
        geoms[1] = new Triangle();
        geoms[2] = new Rectangle();

        for (Geom item : geoms) {
            item.draw();
        }
    }
}
