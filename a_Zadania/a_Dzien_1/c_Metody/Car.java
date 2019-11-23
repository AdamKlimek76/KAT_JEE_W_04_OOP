package a_Zadania.a_Dzien_1.c_Metody;

public class Car {

    private String brand = "toyota";
    private String model = "verso";
    private Double price = 1000.00;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public Double getPrice() {
        return this.price;
    }

    public String toString() {
        return this.brand + this.model + this.price;
    }
}
