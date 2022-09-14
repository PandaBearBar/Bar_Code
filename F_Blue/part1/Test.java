package F_Blue.part1;

import F_Blue.part1.*;

public class Test {
    public static void main(String[] args) {

        Account a1 = new Account(111, 1000);
        Account a2 = new Account(222, 2500);
        Account a3 = new Account(333, 1000);
        Account a4 = new Account(444, 10_000);
        Account a5 = new Account(555, 6000);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        Client client1 = new Client(123, "Choen", "Roni", 2.5, 7);
        client1.addAccount(a1);
        client1.addAccount(a2);
        client1.addAccount(a3);
        client1.addAccount(a4);
        client1.addAccount(a5);
        System.out.println(client1);
        Bank bank = new Bank();
        System.out.println(bank);
    }
}
