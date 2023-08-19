import java.util.Scanner;

public class Exercise3_2 extends Point {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        p1.x = sc.nextDouble();
        p1.y = sc.nextDouble();
        Point p2 = new Point();
        p2.x = sc.nextDouble();
        p2.y = sc.nextDouble();
        Exercise3_2 c1 = new Exercise3_2();
        c1.distance(p1, p2);

    }

}

// Complete the code segment to define a class Point with parameter x,y and
// method distance()for calculating distance between two points.
// Note: Pass objectsof type class Point as argument in distance() method.
class Point {

    public double x;
    public double y;

    public void distance(Point p1, Point p2) {
        System.out.print(Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2)));

    }

}