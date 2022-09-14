package I_Lime.part1;

public class Director extends Employee{
    private String group;

    public Director(String name, double salary, String group) {
        super(name, salary);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Director{" +
                "group='" + group + '\'' +
                "} " + super.toString();
    }
}
