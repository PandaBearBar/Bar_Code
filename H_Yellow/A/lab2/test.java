package H_Yellow.A.lab2;

public class test {
    public static void main(String[] args) {
        SalesPerson person0 = new SalesPerson("Robert",25, 12_000, "123-asd");
        SalesPerson person4 = new SalesPerson("Robert",25, 13_000, "123-asd");
        SalesPerson person5 = new SalesPerson("Robert",25, 11_000, "123-asd");
        System.out.println(person0);
        System.out.println(person0.compareTo(person4));
        System.out.println(person0.compareTo(person5));
        try {
            SalesPerson person1 = new SalesPerson("Jojo", 22, 12_000, "123-123");
            System.out.println(person1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            SalesPerson person2 = new SalesPerson("Lou", 41, 60_000, "asd-asd");
            System.out.println(person2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            SalesPerson person3 = new SalesPerson("Lolo", 32, 15_000, "1234asd");
            System.out.println(person3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
