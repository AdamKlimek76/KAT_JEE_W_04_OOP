package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("duży", 22.11);
        Burger burger1 = new Burger();

        Calculator calculator = new Calculator();
        calculator.add(2.0, 3.0);
        calculator.subtruct(10.0, 5.0);
        calculator.multiply(2.0, 3.0);
        calculator.divide(10.0, 5.0);
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
