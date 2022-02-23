package E_Sgola.A.lab1;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private String city ;
    private boolean isSmoking;

    public Person() {
    }

    public Person(int id, String lastName, String firstName, String city) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
    }

    public Person(int id, String lastName, String firstName, String city, boolean isSmoking) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.isSmoking = isSmoking;
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

    public boolean isSmoking() {
        return isSmoking;
    }

    public void setSmoking(boolean smoking) {
        isSmoking = smoking;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", isSmoking=" + isSmoking +
                '}';
    }
}
