package C_adoma.C.lab1;

public class Calculator {
    private float result;

    public Calculator(float result) {
        this.result = result;
    }
    public float add (float value){
        return result+=value;
    }
    public float sub (float value){
        return result-=value;
    }
    public float mult(float value){
        return result*=value;
    }
    public float div(float value){
        return result/=value;
    }
    public float pow(float value){
        return result = (float)(Math.pow(result, value));
    }
    public float ads(){
        return result = Math.abs(result);
    }
    public float getResult (){
        return result;
    }
}
/*
        Calculator calculator = new Calculator(7);
        calculator.add(2);
        calculator.add(6);
        calculator.sub(1);
        calculator.mult(3);
        calculator.add(3);
        calculator.div(8);
        calculator.sub(1);
        calculator.pow(3);
        float result = calculator.getResult();
        System.out.println(result);
 */