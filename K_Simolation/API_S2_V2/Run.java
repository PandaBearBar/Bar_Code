package K_Simolation.API_S2_V2;

import K_Simolation.API_S2_V2.System.BirthdaySystemReminder;

public class Run {
    public static void main(String[] args) {
        BirthdaySystemReminder birthdaySystemReminder = new BirthdaySystemReminder();
        birthdaySystemReminder.startSystem();
    }
}