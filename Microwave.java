/*
*
* The Microwave program lets the user enter the food they want to heat up and how
* many of the items they want, then gives them the time they need to heat the items up.
*
* @author Jakob
* @version 1.0
* @since 2020-11-26
* Class Microwave
*/

import java.util.Scanner;

/**
* Microwave program calculates cook time depending on item and number of item, with 2 items
* increase time by 50%, for 3 increase by 100%.
*/
final class Microwave {

    /**
    * Constant.
    */
    public static final double SUB = 60;
    /**
    * Constant.
    */
    public static final double PIZZA = 45;
    /**
    * Constant.
    */
    public static final double SOUP = 105;
    /**
    * Constant.
    */
    public static final int MIN = 60;
    /**
    * Constant.
    */
    public static final int ONE = 1;
    /**
    * Constant.
    */
    public static final int TWO = 2;
    /**
    * Constant.
    */
    public static final int THREE = 3;
    /**
    * Constant.
    */
    public static final double MULTIPLIER1 = 1.0;
    /**
    * Constant.
    */
    public static final double MULTIPLIER2 = 1.5;
    /**
    * Constant.
    */
    public static final double MULTIPLIER3 = 2;

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting function.
    *
    * @param args No args will be used
    *
    */

    public static void main(final String[] args) {

        final Scanner myObj = new Scanner(System.in);
        double foodTypeTime = 0.0;
        double amountTime = 0.0;

        try {
            System.out.println("Are you heating up a sub, soup, or pizza? ");
            final String food = myObj.next();
            if ("sub".equals(food)) {
                foodTypeTime = SUB;
            }
            else if ("pizza".equals(food)) {
                foodTypeTime = PIZZA;
            }
            else if ("soup".equals(food)) {
                foodTypeTime = SOUP;
            }
            else {
                System.out.println("Not a valid food.");
                System.exit(0);
            }
        }
        catch (java.util.InputMismatchException error) {
            System.out.println("Invalid food type");
        }

        try {
            System.out.println("How many are you heating up?: ");
            final int foodAmount = myObj.nextInt();
            if (foodAmount == ONE) {
                amountTime = MULTIPLIER1;
            }
            else if (foodAmount == TWO) {
                amountTime = MULTIPLIER2;
            }
            else if (foodAmount == THREE) {
                amountTime = MULTIPLIER3;
            }
            else {
                System.out.println("Invalid number of food.");
                System.exit(0);
            }

            final double time = foodTypeTime * amountTime;
            final double minutesDouble = time / MIN;
            final int minutes = (int) minutesDouble;
            final double seconds = time % MIN;
            // Output
            System.out.println("The total heat up time is " + minutes
                + " minutes and " + seconds + " seconds");
            System.out.println("\nDone.");
        }
        catch (java.util.InputMismatchException error) {
            System.out.println("That was not a number.");
        }
    }
}
