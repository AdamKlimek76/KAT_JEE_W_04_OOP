package b_Zadania_domowe.a_Dzien_1;

public class BankAccount {

    private int number;
    private double cash;

    public BankAccount(int number) {
        cash = 0;
        this.number = number;
    }

    public int getNumber() {
        System.out.println("BankAccount number is:");
        return this.number;
    }

    public double getCash() {
        System.out.println("Cash is:");
        return this.cash;
    }

    public void depositCash(double amount) {
        if (amount < 0.0) {
            System.out.println("Kwota nie może być mniejsza od zera!");
        } else {
            this.cash += amount;
        }
    }

    double withdrawCash(double amount) {
        if (amount < 0.0) {
            amount = 0.0;
            System.out.println("Podana kwota nie może być mniejsza od zera!");
        } else {
            if (this.cash > amount) {
                this.cash -= amount;
            } else {
                amount = this.cash;
                this.cash = 0;
            }
        }
        System.out.println("Zostało wypłacone: ");
        return amount;
    }

    String printInfo() {
        return "Nr konta to:" + this.number + ". Aktualny stan konta: " + this.cash;
    }

}


