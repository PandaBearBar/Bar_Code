package H_Yellow.B.part3;

import H_Yellow.B.part3.Task.Task;

public class Run {

        public static void main(String[] args) {
            Thread thread = new Thread(new Task());
            thread.start();
        }

}
