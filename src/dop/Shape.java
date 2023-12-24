package dop;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> pointList = new ArrayList<>();

    public void addPoint(Point point) {
        pointList.add(point);
    }

    private double[] getSides() {
        int len = pointList.size();
        double[] sides = new double[len];
        for (int i = 0; i < len; i++) {
            sides[i] = pointList.get(i).distance(pointList.get((i + 1) % len).getX(), pointList.get((i + 1) % len).getY());
        }
        sides[len - 1] = pointList.get(len - 1).distance(pointList.get(0).getX(), pointList.get(0).getY());
        return sides;
    }

    public double calculatePerimeter() {
        double sum = 0;
        double[] sides = getSides();
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }

    public double getLongestSide() {
        double[] sides = getSides();
        double max = sides[0];
        for (double side : sides) {
            if (side > max) {
                max = side;
            }
        }
        return max;
    }

    public double calculateAverageSide() {
        double[] sides = getSides();
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum / sides.length;
    }
}