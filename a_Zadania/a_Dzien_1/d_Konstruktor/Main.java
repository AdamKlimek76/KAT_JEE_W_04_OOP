package a_Zadania.a_Dzien_1.d_Konstruktor;

import a_Zadania.a_Dzien_2.a_Dziedziczenie.AdvancedCalculator;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("duży", 22.11);
        Burger burger1 = new Burger();

        Calculator calculator = new Calculator();
        AdvancedCalculator advcalc=new AdvancedCalculator();
        Calculator calculator1=new AdvancedCalculator();
        calculator.add(2.0, 3.0);
        calculator.subtruct(10.0, 5.0);
        calculator.multiply(2.0, 3.0);
        calculator.divide(10.0, 5.0);
        advcalc.pow(2, 2);
        advcalc.root(8, 3);
        advcalc.printOperations();
        calculator.printOperations();
        calculator.clearOperations();
        calculator.printOperations();

        a_Zadania.a_Dzien_1.d_Konstruktor.Person person=new a_Zadania.a_Dzien_1.d_Konstruktor.Person("Adam", "Klimek", 23, 'm');
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getGender());
        System.out.println(person.getSurname());


    }
}
