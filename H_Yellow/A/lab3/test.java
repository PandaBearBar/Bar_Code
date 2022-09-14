package H_Yellow.A.lab3;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();
    }
}
