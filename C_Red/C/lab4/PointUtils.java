package C_Red.C.lab4;

public class PointUtils {

    public static void movePoints(Point[] points, int dx, int dy) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] != null) {
                points[i].move(dx, dy);
            }
        }
    }

    public static Point merge(Point[] points) {
        Point all = new Point(0, 0);
        for (Point p : points) {
            all.move(p.getX(), p.getY());
        }
        return all;
    }
}
/*
        import C_adoma.C.lab4.Point;
        import C_adoma.C.lab4.PointUtils;

        import java.util.Arrays;



        Point p1 = new Point(1,2);
        Point p2 = new Point(3 ,4);
        Point p3 = new Point(5 ,6);
        Point [] points = {p1,p2,p3};
        System.out.println(PointUtils.merge(points));
        PointUtils.movePoints(points, 11, 10);
        System.out.println(Arrays.toString(points));
        System.out.println(PointUtils.merge(points));
 */