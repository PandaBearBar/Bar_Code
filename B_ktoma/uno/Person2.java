package B_ktoma.uno;

import java.time.LocalDate;

public class Person2 {
    private String name = "Moshe";
    private LocalDate birthday = LocalDate.now();

    public Person2() {
    }

    public Person2(String name) {
        this.name = name;
    }

    public Person2(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return this.name + display();
    }

    public String display() {
        LocalDate date = LocalDate.now();
        int year = date.getYear() - this.birthday.getYear()  ;
        int month = Math.abs(date.getMonthValue() - this.birthday.getMonthValue()) ;
        int day = Math.abs(date.getDayOfMonth() - this.birthday.getDayOfMonth())  ;
        if (LocalDate.now().getDayOfMonth() == this.birthday.getDayOfMonth() && LocalDate.now().getMonthValue() == this.birthday.getMonthValue()) {
            return " You are exactly " + year + " years old";
        } else if (LocalDate.now().getDayOfMonth() == this.birthday.getDayOfMonth()) {
            return " You are " + (year-1) + " years old and " + Math.abs(month-12) + " months !";
        } else {
            return "You are " + (year-1) + " years old and " + Math.abs(month-11) + " months " + Math.abs(day-date.getMonth().maxLength())+ " days ";
        }

    }
}
