package K_Simolation.API_S2.Utils;

import K_Simolation.API_S1.Utils.BankStatistics;
import K_Simolation.API_S2.Beans.Person;
import K_Simolation.API_S2.Systems.BirthdaySystemReminder;

import java.util.*;

public class BirthdayStatistics {
    public static int getHappyMonth(List<Person>people) {
        return Collections.max(getEvents(people).entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static int getSadlyMonth(List<Person>people) {
        return Collections.min(getEvents(people).entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static int countMembers(List<Person>people) {
        int sofer = 0;
        for (Integer i: getEvents(people).values()) {
            sofer += i;
        }
        return sofer;
    }

    public static Map<Integer, Integer> getEvents(List<Person>people) {
        Map<Integer, Integer> theMap = new HashMap<>();
        theMap.put(1, countInMonth(1,people));
        theMap.put(2, countInMonth(2,people));
        theMap.put(3, countInMonth(3,people));
        theMap.put(4, countInMonth(4,people));
        theMap.put(5, countInMonth(5,people));
        theMap.put(6, countInMonth(6,people));
        theMap.put(7, countInMonth(7,people));
        theMap.put(8, countInMonth(8,people));
        theMap.put(9, countInMonth(9,people));
        theMap.put(10, countInMonth(10,people));
        theMap.put(11, countInMonth(11,people));
        theMap.put(12, countInMonth(12,people));
        return theMap;
    }

    private static int countInMonth(int month, List<Person>people) {
        int sofer = 0;
        for (Person p: people) {
            if (month == p.getBirthday().getMonthValue()) sofer++;
        }
        return sofer;
    }
}
