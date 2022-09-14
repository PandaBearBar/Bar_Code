package K_Simolation.API_S2_V2.Task;

import K_Simolation.API_S2_V2.Beans.Person;
import K_Simolation.API_S2_V2.System.BirthdaySystemReminder;

import java.time.LocalDate;
import java.util.Set;

public class BirthdayTask implements Runnable{
    private Set<Person> people;

    public BirthdayTask(Set<Person> person) {
        this.people = person;
    }

    @Override
    public void run() {
        System.out.println("" +
                "████████╗██╗  ██╗██████╗ ███████╗ █████╗ ██████╗     ███████╗████████╗ █████╗ ██████╗ ████████╗\n" +
                "╚══██╔══╝██║  ██║██╔══██╗██╔════╝██╔══██╗██╔══██╗    ██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝\n" +
                "   ██║   ███████║██████╔╝█████╗  ███████║██║  ██║    ███████╗   ██║   ███████║██████╔╝   ██║   \n" +
                "   ██║   ██╔══██║██╔══██╗██╔══╝  ██╔══██║██║  ██║    ╚════██║   ██║   ██╔══██║██╔══██╗   ██║   \n" +
                "   ██║   ██║  ██║██║  ██║███████╗██║  ██║██████╔╝    ███████║   ██║   ██║  ██║██║  ██║   ██║   \n" +
                "   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═════╝     ╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   \n" +
                "                                                                                               ");
        while (BirthdaySystemReminder.isIsWorking()){
            try {
                for (Person p: people) {
                    if (p != null
                            && LocalDate.now().getDayOfMonth() == p.getBirthday().getDayOfMonth()
                            && LocalDate.now().getMonthValue() == p.getBirthday().getMonthValue())
                        System.out.println(p + "Happy BirthDay");
                }
                Thread.sleep(1000*30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("" +
                "████████╗██╗  ██╗██████╗ ███████╗ █████╗ ██████╗     ███████╗███╗   ██╗██████╗ \n" +
                "╚══██╔══╝██║  ██║██╔══██╗██╔════╝██╔══██╗██╔══██╗    ██╔════╝████╗  ██║██╔══██╗\n" +
                "   ██║   ███████║██████╔╝█████╗  ███████║██║  ██║    █████╗  ██╔██╗ ██║██║  ██║\n" +
                "   ██║   ██╔══██║██╔══██╗██╔══╝  ██╔══██║██║  ██║    ██╔══╝  ██║╚██╗██║██║  ██║\n" +
                "   ██║   ██║  ██║██║  ██║███████╗██║  ██║██████╔╝    ███████╗██║ ╚████║██████╔╝\n" +
                "   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═════╝     ╚══════╝╚═╝  ╚═══╝╚═════╝ \n" +
                "                                                                               ");
    }
}
