package C_Red.A;

public class Calculator {
    private float tzova;

    public Calculator() {
    }

    public Calculator(float tzova) {
        this.tzova = tzova;
    }

    public float add(float add) {
        return tzova += add;
    }

    public float sub(float sub) {
        return tzova -= sub;
    }

    public float mult(float mult) {
        return tzova *= mult;
    }

    public float div(float div) {
        return tzova /= div;
    }

    public float pow(float pow) {
        return tzova = (float) Math.pow(tzova, pow);
    }

    public float getTzova() {
        System.out.println(tzova);
        return tzova;
    }

    public float abs() {
        return Math.abs(tzova);
    }
}


