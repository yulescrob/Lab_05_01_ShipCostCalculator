public class Main {
    public static void main(String[] args) {
        double itemPrice;
        double shippingCost;
        double totalPrice;

        //simulate input choice
        itemPrice = 33;

        if (itemPrice >= 100) {
            System.out.println("You quality for free shipping. Your total price is " + itemPrice);
        }
        else {
            //calculations
            shippingCost = itemPrice * 0.02;
            totalPrice = itemPrice + shippingCost;
            System.out.println("Your shipping cost is " + shippingCost + " and your total price is " + totalPrice);
        }

    }
}