package H_Yellow.B.part2.Beans;

import H_Yellow.B.part2.Exception.InvalidEmployeeCertException;
import H_Yellow.B.part2.Exception.InvalidEmployeeSalaryException;

public class SalesPerson extends Employee implements Comparable<SalesPerson> {
    private String certificationNumber;

    public SalesPerson(String name, int age, double salary, String certificationNumber) throws InvalidEmployeeCertException, InvalidEmployeeSalaryException {
        super(name, age, salary);
        this.certificationNumber = checkFornation(certificationNumber);
    }

    private static String checkFornation(String certNum) throws InvalidEmployeeCertException {
        if (certNum.length() != 7) throw new InvalidEmployeeCertException("Too Short");
        String part1 = certNum.substring(0, 3);
        char middle = certNum.charAt(3);
        String part2 = certNum.substring(4, 7);
        if (middle != '-') throw new InvalidEmployeeCertException("No middle '-'");
        for (int i = 0; i < part1.length(); i++)
            if (!part1.matches("[0-9]+")) throw new InvalidEmployeeCertException("Where are the Integers");
        for (int i = 0; i < part2.length(); i++)
            if (!part2.matches("[A-Za-z]+")) throw new InvalidEmployeeCertException("Where are the Chars");
        return certNum;
    }

    @Override
    public int compareTo(SalesPerson other) {
        return (this.getSalary() >= other.getSalary()) ? 1 : -1;
    }

    @Override
    public String toString() {
        return "\nSalesPerson{" +
                "certificationNumber='" + certificationNumber + '\'' +
                "} " + super.toString();
    }
}
