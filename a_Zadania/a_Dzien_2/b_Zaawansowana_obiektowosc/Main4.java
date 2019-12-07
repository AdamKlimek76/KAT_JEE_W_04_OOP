package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import a_Zadania.a_Dzien_2.a_Dziedziczenie.AdvancedCalculator;
import a_Zadania.a_Dzien_2.a_Dziedziczenie.Shape;

public class Main4 {

    public static void main(String[] args) {

        Product product = new Product("Produkt1", 20);
        System.out.println(product);
        Product product1 = new Product("Produkt2", 30);
        System.out.println(product1);
        ShoppingCart shoppingCart = new ShoppingCart();


        shoppingCart.addProduct(product, 8);
        shoppingCart.addProduct(product, 10);
        shoppingCart.addProduct(product1, 3);
        shoppingCart.addProduct(product1, 20);
        // shoppingCart.addProduct(product, 10);
        shoppingCart.printShoppingCart();
        System.out.println(shoppingCart.getTotalQuantity());
        System.out.println(shoppingCart.getTotalSum());
        shoppingCart.removeProduct(product1);
        shoppingCart.printShoppingCart();
        System.out.println(shoppingCart.getTotalQuantity());
        System.out.println(shoppingCart.getTotalSum());
        shoppingCart.updateProduct(product1, 100);
        shoppingCart.printShoppingCart();
        System.out.println(shoppingCart.getTotalQuantity());
        System.out.println(shoppingCart.getTotalSum());
        shoppingCart.printReceipt();


    }

}
