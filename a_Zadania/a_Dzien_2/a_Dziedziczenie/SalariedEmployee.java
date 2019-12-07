package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class SalariedEmployee extends Employee {

    public final static int MONTH_HOURS = 190;

    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment() {

        return wage * MONTH_HOURS;
    }
}
