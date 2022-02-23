package C_adoma.B.lab1;

public class Calculator {
    private float result;

    public Calculator() {
    }

    public Calculator(float result) {
        this.result = result;
    }

    public float add(float val) {
        return this.result = this.result + val;
    }

    public float sub(float val) {
        return this.result = this.result - val;
    }

    public float mult(float val) {
        return this.result = this.result * val;
    }

    public float div(float val) {
        return this.result = this.result / val;
    }

    public float pow(float val) {
        return this.result = (float) Math.pow(this.result, val);
    }

    public float getResult() {
        return this.result;
    }

    public float abs() {
        return this.result = (float) Math.abs(this.result);
    }

}

