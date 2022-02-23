package C_adoma.C.lab3;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Line (Line line){
        this(line.point1,line.point2);
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
}
/*
        Point p1 = new Point(10, 12);
        Point p2 = new Point(22, 11);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(l1);
        l1 = new Line(p2,p1);
        System.out.println(l1);
        System.out.println(l2);
 */
