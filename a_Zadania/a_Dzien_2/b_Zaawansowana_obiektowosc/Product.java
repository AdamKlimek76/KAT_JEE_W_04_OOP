package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class Product {

    private int id;
    private String name;
    private double price;
    private static int nextId;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        id = nextId;
        nextId++;
    }

    public void setPrice(double price) {
        if (price < 0.01) {
            throw new ToLowPriceExeption("Podana cena jest zbyt niska!");
        } else {
            this.price = price;
        }
    }

    public String toString() {
        return id + " " + name + " " + price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    /*public boolean equals(Product product) {
        if (this.name.equals(product.name) && this.price == product.price) {
            return true;
        } else {
            return false;
        }
    }*/

}
