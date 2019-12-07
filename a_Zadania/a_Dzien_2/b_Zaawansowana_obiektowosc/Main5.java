package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class Main5 {

    public static void main(String[] args) {

        Product product = new Product("Produkt1", 20);
        System.out.println(product);
        Product product1 = new Product("Produkt2", 30);
        System.out.println(product1);
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product2=new Product("Produkt1", 10);

        System.out.println(product.equals(product2));
        //String text1="Produkt1";
        //String text2="Produkt1";
        //System.out.println(text1.equals(text2));


    }



}
