package K_Simolation.BankSystemElad.simulation1.simulation1.utils;

/*
Created by Elad on 17/03/2022

*/


import K_Simolation.BankSystemElad.simulation1.simulation1.beans.Account;
import K_Simolation.BankSystemElad.simulation1.simulation1.beans.Client;
import K_Simolation.BankSystemElad.simulation1.simulation1.beans.RegularClient;
import K_Simolation.BankSystemElad.simulation1.simulation1.beans.VipClient;

public class FactoryMethods {
    public static Client initRegClient() {
        return new RegularClient(5, initAccount());
    }

    public static Client initVipClient() {
        return new VipClient(10, initAccount());
    }

    public static Account initAccount() {
        Account a1 = new Account();
        a1.setBalance((int) (Math.random() * 5000));
        return a1;
    }
}
