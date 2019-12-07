package b_Zadania_domowe.a_Dzien_1;

import a_Zadania.a_Dzien_1.d_Konstruktor.Burger;
import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount1=new BankAccount(111);
        System.out.println(bankAccount1.getCash());
        System.out.println(bankAccount1.getNumber());
        bankAccount1.depositCash(120.00);
        System.out.println(bankAccount1.getCash());
        bankAccount1.depositCash(180.00);
        System.out.println(bankAccount1.printInfo());
        System.out.println(bankAccount1.withdrawCash(100.00));
        System.out.println(bankAccount1.withdrawCash(500.00));
        System.out.println(bankAccount1.withdrawCash(-100.00));
        System.out.println(bankAccount1.printInfo());

    }
}
