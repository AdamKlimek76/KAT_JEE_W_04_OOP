package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Burger {
    private String size;
    private double price;

    public Burger(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public Burger() {
        this.size = "bardzo duży";
        this.price = 100.00;
    }

}
