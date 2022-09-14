package K_Simolation.API_S2_V2.Utils;

import K_Simolation.API_S2_V2.Beans.Person;
import K_Simolation.API_S2_V2.System.BirthdaySystemReminder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BirthdayStatistics {
    public static int getHappyMonth(){
        return Collections.max(getEvents().entrySet(),Map.Entry.comparingByValue()).getKey();
    }
    public static int getSadlyMonth(){
        return Collections.min(getEvents().entrySet(),Map.Entry.comparingByValue()).getKey();
    }
    public static Map<Integer,Integer> getEvents(){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,numOfBirthday(1));
        map.put(2,numOfBirthday(2));
        map.put(3,numOfBirthday(3));
        map.put(4,numOfBirthday(4));
        map.put(5,numOfBirthday(5));
        map.put(6,numOfBirthday(6));
        map.put(7,numOfBirthday(7));
        map.put(8,numOfBirthday(8));
        map.put(9,numOfBirthday(9));
        map.put(10,numOfBirthday(10));
        map.put(11,numOfBirthday(11));
        map.put(12,numOfBirthday(12));
        return map;
    }

    private static Integer numOfBirthday(int month) {
        int sofer = 0;
        for (Person p : BirthdaySystemReminder.getPersonList()) {
            if (month == p.getBirthday().getMonthValue())sofer++;
        }
        return sofer;
    }

}
