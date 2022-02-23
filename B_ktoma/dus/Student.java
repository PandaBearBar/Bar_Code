package B_ktoma.dus;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private float avg;
    private String teacher;
    public Student(){}

    public Student(int id, String lastName, String firstName, float avg, String teacher) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.avg = avg;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", avg=" + avg +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
