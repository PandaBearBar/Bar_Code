package C_adoma.A;

public class Employee {
    private String fname;
    private String lname;
    private Date nolad;
    private Date nichnas;

    public Employee(String fname, String lname, Date nolad, Date nichnas) {
        this.fname = fname;
        this.lname = lname;
        this.nolad = nolad;
        this.nichnas = nichnas;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\n' +
                ", nolad=" + nolad +
                ", nichnas=" + nichnas +
                '}';
    }
}
