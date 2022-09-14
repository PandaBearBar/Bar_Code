package I_Lime.part5;

public class Engineer extends Employee {
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

    @Override
    public void draw() {
        System.out.println(
                "███████ ███    ██  ██████  ██ ███    ██  ██████  ███████ ███████ ██████  \n" +
                "██      ████   ██ ██       ██ ████   ██ ██       ██      ██      ██   ██ \n" +
                "█████   ██ ██  ██ ██   ███ ██ ██ ██  ██ ██   ███ █████   █████   ██████  \n" +
                "██      ██  ██ ██ ██    ██ ██ ██  ██ ██ ██    ██ ██      ██      ██   ██ \n" +
                "███████ ██   ████  ██████  ██ ██   ████  ██████  ███████ ███████ ██   ██ \n" +
                "                                                                         \n" +
                "                                                                         ");
    }
}
