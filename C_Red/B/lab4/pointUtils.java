package C_Red.B.lab4;

import C_Red.B.lab3.Point;

public class pointUtils {

    public static void print(Point[] points){
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
    }

    public static void movePoints(Point[] points, int dx, int dy){
        for (int i = 0; i < points.length; i++) {
            points[i].move(dx, dy);

        }
        print(points);
    }
    public static Point merge(Point [] points){
        for (int i = 1; i < points.length; i++) {
            points[0].setX(points[0].getX()+points[i].getX());
            points[0].setY(points[0].getY()+points[i].getY());
        }
        return points[0];
    }

}
