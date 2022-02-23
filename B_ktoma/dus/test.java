package B_ktoma.dus;

import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        Person2 p2 = new Person2("Riki");
        Person2 p3 = new Person2("Bar", LocalDate.of(1999, 8, 27));
        Person2 p4 = new Person2("Lea", LocalDate.of(1999, 2, 12));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
