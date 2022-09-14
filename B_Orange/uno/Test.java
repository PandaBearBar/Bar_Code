package B_Orange.uno;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
//        Flight f1 = new Flight("101", "El Al", "Isreal", "Bobo");
//        Flight f2 = new Flight("10101", "El Alala", "Isrealili", "Bobobobo", LocalDateTime.now() );
//        System.out.println(f1);
//        System.out.println(f2);
//        Airplane a1 = new Airplane();
//        Airplane a2 = new Airplane(12,12, LocalDate.of(2020, 12, 21));
//        Airplane a3 = new Airplane(13,15,LocalDate.of(2020, 11, 21),LocalDate.EPOCH);
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        Log l1 = new Log();
//        Log l2 = new Log(15454578,"the world","the log of bar saadi",318876851);
//        Log l3 = new Log(123456789, "wow", "yalla !! ", 318776851, LocalDateTime.of(2111,12,5,21,12));
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(l3);
//        Coupon c1 = new Coupon("yoyo", "a game ", LocalDate.now(),LocalDate.now().plusWeeks(1),100, 200);
//        Coupon c2 = new Coupon(111,"yoyo", "a game ", LocalDate.now(),LocalDate.now().plusWeeks(54),100, 200);
//        System.out.println(c1);
//        System.out.println(c2);
        Person2 p1 = new Person2("Bar");
        Person2 p2 = new Person2("Emely",LocalDate.of(1999, 3, 30));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();
    }

    public static void Person() {
        Person p1 = new Person();
        Person p2 = new Person(123, "Choen", "Bar");
        Person p3 = new Person(111, "Riko", "Enriko", "Tel Aviv", true);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void Date() {
        Date d1 = new Date();
        Date d2 = new Date(27, 8, 1999);
        System.out.println(d1);
        System.out.println(d2);
    }

    public static void Item() {
        Item one = new Item("Bar", "Cool Drinks");
        Item two = new Item(001, "Barsa", 10, "Soccer Team");
    }

    public static void Dog() {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Koki",21);
        Dog d3 = new Dog("Loosy", 12, "White");
        Dog d4 = new Dog("miki", 120, "red", true);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }

    public static void Fish () {
        Fish f1 = new Fish();
        Fish f2 = new Fish("Yosi", "Torkiz");
        Fish f3 = new Fish("Moti","kahol",24);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }

    public static void Rectangle(){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(21, 12) ;
        Rectangle r3 = new Rectangle(31, 13 , "Blue");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

    public static void Printer (){
        Printer p1 = new Printer();
        Printer p2 = new Printer(666, "cool", "Bars factory");
        Printer p3 = new Printer(777, "koko", "bobo", true);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void Light () {
        Light l1 = new Light();
        Light l2 = new Light(12, 20);
        Light l3 = new Light(33, "Shakof");
        Light l4 = new Light(14, "Red", 170);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }

    public static void Box() {
        Box b1 = new Box();
        Box b2 = new Box(78, 18, 55);
        System.out.println(b1);
        System.out.println(b2);
    }

    public static void Student(){
        Student s1 = new Student();
        Student s2 = new Student(666, "Bar", "Saadi", 999, "Kobi");
        System.out.println(s1);
        System.out.println(s2);
    }
}
