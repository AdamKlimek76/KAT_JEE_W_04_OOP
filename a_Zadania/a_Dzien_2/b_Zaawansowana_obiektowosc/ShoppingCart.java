package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


import java.util.Arrays;

public class ShoppingCart {

    CartItem[] cartItems;


    public ShoppingCart() {
        cartItems = new CartItem[0];
    }

    public void addProduct(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        if (cartItems.length == 0) {
            cartItem.product = product;
            cartItem.quantity = quantity;
            CartItem[] newTab = Arrays.copyOf(cartItems, cartItems.length + 1);
            newTab[cartItems.length] = cartItem;
            cartItems = newTab;
        } else {
            boolean isDuplicateProduct = false;

            for (int i = 0; i < cartItems.length; i++) {
                if (cartItem.product.equals(cartItems[i].product)) {
                    cartItems[i].quantity += quantity;
                    isDuplicateProduct = true;
                    break;
                }
            }
            if (isDuplicateProduct == false) {
                cartItem.product = product;
                cartItem.quantity = quantity;
                CartItem[] newTab = Arrays.copyOf(cartItems, cartItems.length + 1);
                newTab[cartItems.length] = cartItem;
                cartItems = newTab;
            }
        }
    }

    public void removeProduct(Product product) {
        if (cartItems.length > 0) {
            for (int i = 0; i < cartItems.length; i++) {
                if (cartItems[i].product.equals(product)) {
                    cartItems[i].quantity = 0;
                }
            }
        }
    }

    public void updateProduct(Product product, int quantity) {
        if (cartItems.length > 0) {
            for (int i = 0; i < cartItems.length; i++) {
                if (cartItems[i].product.equals(product)) {
                    cartItems[i].quantity += quantity;
                }
            }
        }
    }

    public int getTotalQuantity() {
        int totalQuantity = 0;
        if (cartItems.length > 0) {
            for (int i = 0; i < cartItems.length; i++) {
                totalQuantity += cartItems[i].quantity;
            }
        }
        return totalQuantity;
    }

    public double getTotalSum() {
        double totalSum = 0.0;
        if (cartItems.length > 0) {
            for (int i = 0; i < cartItems.length; i++) {
                totalSum += cartItems[i].quantity * cartItems[i].product.getPrice();
            }
        }
        return totalSum;
    }

    public void printReceipt() {
        double totalSum = 0.0;
        if (cartItems.length > 0) {
            for (int i = 0; i < cartItems.length; i++) {
                System.out.println((i+1) + ": " + cartItems[i].product.getName() + ", "
                        + cartItems[i].quantity + "x" + cartItems[i].product.getPrice() + " = "
                        + cartItems[i].quantity * cartItems[i].product.getPrice());
                totalSum += cartItems[i].quantity * cartItems[i].product.getPrice();
            }
            System.out.println("---");
            System.out.println("Razem: " + totalSum);
        }
    }


    public void printShoppingCart() {
        for (int i = 0; i < cartItems.length; i++) {
            System.out.println(cartItems[i]);
        }
    }
}
