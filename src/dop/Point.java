package dop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double otherX, double otherY) {
        return Math.sqrt(Math.pow(x - otherX, 2) + Math.pow(y - otherY, 2));
    }

    // Геттеры и сеттеры для x и y, если нужны
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}