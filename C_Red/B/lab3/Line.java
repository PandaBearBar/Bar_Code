package C_Red.B.lab3;

public class Line {
    private Point p1;
    private Point p2;
    public Line (Point p1, Point p2 ) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Line(Line l1){
        this(l1.p1,l1.p2);
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
