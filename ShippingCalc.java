import java.util.Scanner;
public class ShippingCalc {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final double RATE_UNDER_2_POUNDS = 1.10, RATE_UP_TO_6_POUNDS = 2.20;
        final double RATE_UP_TO_10_POUNDS = 3.70, RATE_OVER_10_POUNDS = 3.80;
        
        double packageWeight = 0, shippingCost = 0, totalCost = 0;
    
        System.out.println("Enter the weight of the package (in pounds): ");
        packageWeight = keyboard.nextDouble();
        
        if (packageWeight <= 2) {
            shippingCost = RATE_UNDER_2_POUNDS;
        } else if (packageWeight <= 6) {
            shippingCost = RATE_UP_TO_6_POUNDS;
        } else if (packageWeight <= 10) {
            shippingCost = RATE_UP_TO_10_POUNDS;
        } else {
            shippingCost = RATE_OVER_10_POUNDS;
        }
        
        totalCost = packageWeight * shippingCost;
        
        System.out.println("\nYour package will ship at a rate of $" + shippingCost + " per pound.");
        System.out.printf("The total cost of shipping your %.2f lbs package is $%.2f.", packageWeight, totalCost);
        System.out.println("\nThank you for choosing Fast Freight Shipping Company");

        keyboard.close();
    }
}
