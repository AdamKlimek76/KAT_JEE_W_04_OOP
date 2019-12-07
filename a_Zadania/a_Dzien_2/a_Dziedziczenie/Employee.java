package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    protected double wage;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public double getWage(){
        return this.wage;
    }

    void raiseWage(int percent) {

        if (percent < 0) {
            System.out.println("Procent nie moze byc mniejszy od zera!");
        } else {
            this.wage += this.wage * percent * 0.01;
        }
    }

}
