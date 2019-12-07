package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Burger;
import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;
import a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc.Product;

public class Main3 {

    public static void main(String[] args) {

        Shape shape = new Shape(0, 0, "black");
        Shape shape1 = new Shape(1, -1, "white");
        double distance = shape.getDistance(shape1);
        System.out.println("Odległość pomiędzy shapemi wynosi: " + distance);
        System.out.println(shape.getDiscription());
        Circle circle = new Circle(0, 0, "black", 1);
        System.out.println(circle.getDiscription());
        Circle circle1 = new Circle(2, 2, "black", 10);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircuit());
        System.out.println("Odległośc pomiędzy okręgami " + circle.getDistance(circle1));
        HourlyEmployee employee = new HourlyEmployee(1, "Adam", "Klimek", 10);
        System.out.println("Pracownik zarobił " + employee.calculatePayment(5));
        SalariedEmployee employee1 = new SalariedEmployee(3, "Józef", "Nowak", 100);
        System.out.println("W miesiącu zarobił " + employee1.calculatePayment());
        Employee employee2 = new Employee(4, "Anna", "Kowalska", 100);
        System.out.println("Przed podwyżką " + employee2.getWage());
        employee2.raiseWage(10);
        System.out.println("Po podwyżce " + employee2.getWage());


        double pow = Math.pow(3, 2);
        System.out.println(pow);
        double sqr = Math.sqrt(4);
        System.out.println(sqr);
        System.out.println(Math.cbrt(8));
        System.out.println("Pierwiastek n-tego stopnia " + Math.pow(27, 1.0 / 3.0));

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        AdvancedCalculator advancedCalculator1 = new AdvancedCalculator();
        Calculator calculator = new Calculator();
        calculator.subtruct(10, 5);
        calculator.divide(10, 5);
        calculator.multiply(10, 5);
        calculator.add(5, 10);
        advancedCalculator.pow(3, 3);
        advancedCalculator.root(3, 3);
        advancedCalculator1.pow(4, 4);
        advancedCalculator1.root(4, 4);
        AdvancedCalculator.computeCircleArea(10);
        advancedCalculator.printOperations();
        advancedCalculator1.printOperations();
        //AdvancedCalculator.printGlobalOperations();
        //AdvancedCalculator.printGlobalOperations(33);
        AdvancedCalculator.printGlobalOperations("6");



        String strValue = "33a";
        try {
            int value = Integer.parseInt(strValue);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("Nie można " + strValue + " zamienić na liczbę.");
        }


    }

}
