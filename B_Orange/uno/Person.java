package B_Orange.uno;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private String city ;
    private boolean isSmokeing;

    public Person() {
    }

    public Person(int id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(int id, String lastName, String firstName, String city, boolean isSmokeing) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.isSmokeing = isSmokeing;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isSmokeing() {
        return isSmokeing;
    }

    public void setSmokeing(boolean smokeing) {
        isSmokeing = smokeing;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", isSmokeing=" + isSmokeing +
                '}';
    }
}
