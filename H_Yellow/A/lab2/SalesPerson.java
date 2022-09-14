package H_Yellow.A.lab2;

public class SalesPerson extends Employee implements Comparable<SalesPerson> {
    private String certificationNumber;

    public SalesPerson(String employeName, int age, double salary, String certificationNumber) {
        super(employeName, age, salary);
        this.certificationNumber = requireValidCertificationNumber(certificationNumber);
    }

    public static String requireValidCertificationNumber(String certNum) {
        if (checkCertNum(certNum)) return certNum;
        else throw new InvalidEployeCertExeption("Invalid cert num");
    }

    private static boolean checkCertNum(String certNum) {
        if (certNum.length() != 7) return false;

        String nums = certNum.substring(0, 2);

        for (int i = 0; i < nums.length(); i++) if (!Character.isDigit(nums.charAt(i))) return false;

        String chars = certNum.substring(4, 7);

        for (int i = 0; i < chars.length(); i++) if (Character.isDigit(chars.charAt(i))) return false;

        return certNum.indexOf("-") == 3;
    }

    @Override
    public int compareTo(SalesPerson other) {
       return  (this.getSalary() > other.getSalary()) ? 1 : -1 ;
    }
}
