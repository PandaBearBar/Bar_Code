package C_Red.A;

import java.time.Year;

public class Date {
    private int y;
    private int m;
    private int d;

    public Date(int y, int m, int d) {
        this.y = y;
        this.m = checkMonth(m);
        this.d = checkDay(d);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int checkMonth(int m) {
        if (0 < m && m < 13) {
            return m;
        }

        return 1;
    }

    public int checkDay(int d) {
        switch (this.m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (0 < d && d < 32) {
                    return d;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (0 < d && d < 31) {
                    return d;
                }
            default:
            if (0<d&&d<29 && Year.isLeap(this.y)){
                return d;
            }
            else if(0<d&&d<30){
                return d;
            }
            break;

        }


        return this.d = 1;
    }

    @Override
    public String toString() {
        return "Date{" +
                "y=" + y +
                ", m=" + m +
                ", d=" + d +
                '}';
    }
}
