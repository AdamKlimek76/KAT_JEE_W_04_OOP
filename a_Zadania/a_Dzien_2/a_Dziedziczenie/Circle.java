package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Circle extends Shape {

    private double radius;

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDiscription() {
        return " promień okręgu " + this.radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public double getCircuit() {
        return 3.14 * 2 * this.radius;
    }
}
