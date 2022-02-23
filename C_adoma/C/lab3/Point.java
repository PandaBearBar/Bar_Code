package C_adoma.C.lab3;

public class Point {
    private int X;
    private int y;

    public Point(int x, int y) {
        this.X = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", y=" + y +
                '}';
    }
}
