package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class CartItem {

    protected Product product;
    protected int quantity;

    public CartItem(Product product, int quantity) {
        this.product=product;
        this.quantity=quantity;
    }

    public String toString() {
        return product + " " + quantity;
    }
}
