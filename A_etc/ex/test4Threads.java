package A_etc.ex;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class test4Threads {
    public static void main(String[] args) {
        System.out.println(1);
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(3);
                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(4);
                    }
                });
                t2.start();

            }
        });
        t1.start();
        System.out.println(2);
    }
}
