package B_Orange.dus;

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
        return display(this.name, this.birthday);
    }

    public String display(String name, LocalDate birthday) {
        int day = birthday.getDayOfMonth();
        int month = birthday.getMonthValue();
        int year = birthday.getYear();
        int nowDay = LocalDate.now().getDayOfMonth();
        int nowMonth = LocalDate.now().getMonthValue();
        int nowYear = LocalDate.now().getYear();
        if (month != nowMonth && nowDay != day) {
            if (month > nowMonth) {
                if (day > nowDay)
                    return name + " Age :" + (nowYear - year-1)+" Years "+ "and Months : " + (month - nowMonth-1) + "and Days : " + ((day - nowDay));
                else
                    return name + " Age :" + (nowYear - year-1) +" Years "+ "and Months : " + (month - nowMonth-1) + "and Days : " +  ((nowDay - day));
            } else return name + " Age :" + (nowYear - year-1) +" Years "+ "and Months : " + (nowMonth - month-1) + "and Days : " +  ((day - nowDay));
        }
        else if (month != nowMonth && day == nowDay) {
            if (month > nowMonth) return name + " Age :" + (nowYear - year) +" Years "+ "and Months : "+ (month - nowMonth);
            else return name + " Age :" + (nowYear - year-1) +" Years "+ "and Months : " + (nowMonth - month);

        }
        return name + " Age : " + (nowYear - year) + " Years old";
    }
}
