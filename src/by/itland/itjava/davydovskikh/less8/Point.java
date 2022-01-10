package by.itland.itjava.davydovskikh.less8;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private double distance(Point other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }

    public static void main(String[] args) {
        Point pointA = new Point(4, 5);
        Point pointB = new Point(-4, -5);

        System.out.println(pointB.distance(pointA));
    }
}

