package H_Yellow.B.part2;


import H_Yellow.B.part2.Beans.SalesPerson;
import H_Yellow.B.part2.Exception.InvalidEmployeeCertException;
import H_Yellow.B.part2.Exception.InvalidEmployeeSalaryException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
    public static void main(String[] args) throws InvalidEmployeeCertException, InvalidEmployeeSalaryException {

        SalesPerson person0 = new SalesPerson("Robert", 25, 12_000, "123-asd");
        SalesPerson person4 = new SalesPerson("Lobert", 25, 13_000, "123-asd");
        SalesPerson person5 = new SalesPerson("Mobert", 25, 11_000, "121-asd");
        SalesPerson person6 = new SalesPerson("Sobert", 25, 16_000, "122-asd");
        System.out.println(person0);
        for (int i = 0; i < 6; i++) {
            try {
                switch (i) {
                    case 0:
                        SalesPerson person1 = new SalesPerson("Jojo", 22, 12_000, "123-123");
                        break;
                    case 1:
                        SalesPerson person2 = new SalesPerson("Lou", 41, 30_000, "123-as1");
                        break;
                    case 2:
                        SalesPerson person7 = new SalesPerson("Lou", 41, 30_000, "asd-asd");
                        break;
                    case 3:
                        SalesPerson person3 = new SalesPerson("Lolo", 32, 15_000, "1234asd");
                        break;
                    case 4:
                        SalesPerson person8 = new SalesPerson("Lolo", 32, 15_000, "11d-asd");
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        List<SalesPerson> salesPeople = new ArrayList<>();
        salesPeople.add(person0);
        salesPeople.add(person4);
        salesPeople.add(person5);
        salesPeople.add(person6);
        Collections.sort(salesPeople);
        System.out.println(salesPeople);
    }
}
