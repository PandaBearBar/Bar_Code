package K_Simolation.BankSystemElad.simulation1.simulation1;

/*
Created by Elad on 16/03/2022

*/


import K_Simolation.BankSystemElad.simulation1.simulation1.beans.BankSystem;

public class Run {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();

        while (bankSystem.isContinueProgram()) {
            try {
                bankSystem.startSystem();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
