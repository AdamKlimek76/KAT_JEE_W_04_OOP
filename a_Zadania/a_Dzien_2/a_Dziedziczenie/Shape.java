package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Shape {
    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getDiscription() {
        return "Kolor " + this.color + "  x " + this.x + " y " + this.y;
    }

    public double getDistance(Shape shape) {
        double distance = Math.sqrt(Math.pow((this.x - shape.x), 2) + Math.pow((this.y - shape.y), 2));

        return distance;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

}
