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
* increase time by 50%, for 3 increase by 100%
*/
public class Microwave {

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

    try {
        final Scanner myObj = new Scanner(System.in);
        System.out.println("Are you heating sub, pizza, or soup?: ");
        String food = myObj.nextLine();

        if(food.toLowerCase().equals("sub")) {
            double time = 60;
            System.out.println("How many sub(s) are you cooking?(max:3): ");

            // stores user input
            int subs = myObj.nextInt();

            if(subs == 2) {
                time *= 1.5;
            }
            else if(subs == 3) {
                time *= 2;
            }
            System.out.println("The total cook time is " + time);

        }
        else if(food.toLowerCase().equals("pizza")) {
            double time = 45;
            System.out.println("How many pizza(s) are you cooking?(max:3): ");

            // stores user input
            int pizzas = myObj.nextInt();

            if(pizzas == 2) {
                time = 67.5;
            }
            else if(pizzas == 3) {
                time = 90;
            }
            int minutes = (int) time / 60;
            double seconds = (time%60);
            System.out.println("The total cook time is " + minutes + " minutes and " + seconds + " seconds");

        }

        else if(food.toLowerCase().equals("soup")) {
            int time = 105;
            System.out.println("How many soup(s) are you cooking?(max:3): ");

            // stores user input
            int soups = myObj.nextInt();

            if(soups == 2) {
                time *= 1.5;
            }
            else if(soups == 3) {
                time *= 2;
            }
            System.out.println("The total cook time is " + time);
        }
        catch (java.util.InputMismatchException errorCode) {
            System.out.println("The maximum quantity of food is 3.");
            }
            System.out.println("\nDone");
        }
    }
}
