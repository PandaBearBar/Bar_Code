package K_Simolation.API_S2.Systems;

import H_Yellow.A.lab3.Task;
import K_Simolation.API_S2.Beans.Person;
import K_Simolation.API_S2.Task.BirthdayTask;
import K_Simolation.API_S2.Utils.BirthdayStatistics;
import K_Simolation.API_S2.Utils.FactoryUtils;

import java.time.LocalDate;
import java.util.*;

public class BirthdaySystemReminder {
    private static Set<Person> people;
    private BirthdayTask task;
    private static Scanner scanner = new Scanner(System.in);

    public BirthdaySystemReminder() {
        this.people = new HashSet<Person>();
        task  = new BirthdayTask(people);
        startSystem();
    }


    public Set<Person> getPeople() {
        return people;
    }

    public void setPeople(Set<Person> people) {
        this.people = people;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        BirthdaySystemReminder.scanner = scanner;
    }

    public void showMenu() {
        System.out.println("" +
                "Hello User Thoese are ur options :\n" +
                "1.Add a Friend\n" +
                "2.Remove a Friend\n" +
                "3.Print ur Friends\n" +
                "4.Print amount of friend You have\n" +
                "5.Happiest Month\n" +
                "6.Saddest Month\n" +
                "7.Print all Events\n" +
                "8.Exit Program" +
                "");
    }

    private int returnNum(String scanner) {
        return scanner.matches("[0-9]") ? Integer.parseInt(scanner) : 0;
    }

    public void startSystem() {
        int bhira;
        Thread thread = new Thread(task);
        thread.start();
        boolean isEnd = false;
        while (!isEnd) {
            showMenu();
            bhira = returnNum(scanner.next());
            switch (bhira) {
                case 1:
                    addPerson(new Person());
                    break;
                case 2:
                    deletePerson(getPersonId());
                    people.add(new Person(666, "Bar", LocalDate.now()));
                    break;
                case 3:
                    PrintAll();
                    break;
                case 4:
                    printCount();
                    break;
                case 5:
                    printHappyMonth(new ArrayList<Person>(people));
                    break;
                case 6:
                    printSadlyMonth(new ArrayList<Person>(people));
                    break;
                case 7:
                    printEvents(new ArrayList<Person>(people));
                    break;
                case 8:
                    isEnd = true;
                    endSystem();
                    break;
                default:
                    System.out.println("Invalid Replay ! TRY AGAIN...");
                    break;
            }
        }
        thread.stop();
    }

    private void printEvents(ArrayList<Person> people) {
        for (Map.Entry<Integer, Integer> entry: BirthdayStatistics.getEvents(new ArrayList<>(people)).entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            System.out.println("Month : " + key + "||Birthdays : " + val);
        }
    }

    public void printSadlyMonth(ArrayList<Person> people) {
        System.out.println("Sadly Month : " + BirthdayStatistics.getSadlyMonth(people));
    }

    public void printHappyMonth(ArrayList<Person> people) {
        System.out.println("Happy Month : " + BirthdayStatistics.getHappyMonth(people));
    }

    public void printCount() {
        System.out.println("U got : " + BirthdayStatistics.countMembers(new ArrayList<>(people)) + " friends");
    }

    public void PrintAll() {
        List<Person> peopleSet = new ArrayList<Person>(people);
        Collections.sort(peopleSet);
        for (Person p: peopleSet) {
            System.out.println(p);
        }
    }

    public void deletePerson(int personId) {
        boolean isThere = false;
        for (Person p: people) {
            if (personId == p.getId()) {
                people.remove(p);
                System.out.println("Removed");
                isThere = true;
                break;
            }
        }
        if (!isThere) {
            System.out.println("User haven't been found");
        }
    }

    private int getPersonId() {
        int bhira = 0;
        while (bhira == 0) {
            System.out.println("What is the ID of ur friend that u want to remove from \"LIFE\" ?");
            bhira = returnNum(scanner.next());
        }
        return bhira;
    }

    public void addPerson(Person person) {
        System.out.println("Added");
        this.people.add(person);
    }

    public void endSystem() {
        System.out.println("Thank u for using me :*)");
        scanner.close();
    }
}
