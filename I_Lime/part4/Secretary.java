package I_Lime.part4;

public class Secretary extends Employee {
    private String office;


    public Secretary(String name, double salary, String office) {
        super(name, salary);
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "office='" + office + '\'' +
                "} " + super.toString();
    }

    @Override
    public void draw() {
        System.out.println(
                "███████ ███████  ██████ ██████  ███████ ████████  █████  ██████  ██    ██ \n" +
                "██      ██      ██      ██   ██ ██         ██    ██   ██ ██   ██  ██  ██  \n" +
                "███████ █████   ██      ██████  █████      ██    ███████ ██████    ████   \n" +
                "     ██ ██      ██      ██   ██ ██         ██    ██   ██ ██   ██    ██    \n" +
                "███████ ███████  ██████ ██   ██ ███████    ██    ██   ██ ██   ██    ██    \n" +
                "                                                                          \n" +
                "                                                                          ");
    }
}
