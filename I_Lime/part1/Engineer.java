package I_Lime.part1;

public class Engineer extends Employee{
    private String Specialty;

    public Engineer(String name, double salary, String specialty) {
        super(name, salary);
        Specialty = specialty;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "Specialty='" + Specialty + '\'' +
                "} " + super.toString();
    }
}
