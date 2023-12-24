import dop.Point;
import dop.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\hakna\\IdeaProjects\\untitled1\\src\\source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        sc.close();

        System.out.println("The Perimeter is: " + shape.calculatePerimeter());
        System.out.println("The Longest Side is: " + shape.getLongestSide());
        System.out.println("The Average Side is: " + shape.calculateAverageSide());
    }
}
