package K_Simolation.API_S2.Task;

import K_Simolation.API_S2.Beans.Person;
import K_Simolation.API_S2.Systems.BirthdaySystemReminder;
import K_Simolation.API_S2.Utils.DateUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class BirthdayTask implements Runnable {
    private Set<Person> people;

    public BirthdayTask(Set<Person> people) {
        this.people = people;
    }

    @Override
    public void run() {
        System.out.println("TASK STARTED !");
        while (true) {

            for (Person p: people) {
                if (p.hashCode() == LocalDate.now().getDayOfYear()) {
                    System.out.println(p.getName() + " you got a birthday today horray.\nToday is : " + DateUtils.BeautifyDate(p.getBirthday()));
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
