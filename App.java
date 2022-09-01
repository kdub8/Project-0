
/***************************************************************  
*  file: PizzaParty.java
*  author: Kevin Wong  
*  class: CS 1400 – Intro to Programming and Problem Solving  
*  
*  assignment: program 2  
*  date last modified: 2/18/2022 
*  
*  purpose: This program calculates the cost of hosting three pizza parties on Friday, Saturday and
*           Sunday. It reads from the standard input stream the number of people attending, the average number of slices per
*	    person and the cost of one pizza. All dollar values are then output to the screen to two decimal places.
*	    The cost for all the pizzas is calculated, then a 7% tax is charged. A delivery charge of 20% is then applied to the cost of all the pizzas
*	    including tax. The above is all calculated for Friday, then the above is repeated with more inputs for Saturday and Sunday.
*	    A total for all 3 parties is recorded and outputted as the Weekend Total.
*
****************************************************************/

import java.util.Scanner;

public class App {

    // method: main
    // purpose: This method is the entry point from where execution starts.

    public static void main(String[] args) {
        int numPeople;
        double averageSlices;
        double costOfOnePizza;
        double numPizzas;
        double costOfPizzas;
        double roundedPizzas;
        double totalSalesTax;
        double totalDeliveryCharge;
        double totalCost;

        int numPeople2;
        double averageSlices2;
        double costOfOnePizza2;
        double numPizzas2;
        double costOfPizzas2;
        double roundedPizzas2;
        double totalSalesTax2;
        double totalDeliveryCharge2;
        double totalCost2;

        int numPeople3;
        double averageSlices3;
        double costOfOnePizza3;
        double numPizzas3;
        double costOfPizzas3;
        double roundedPizzas3;
        double totalSalesTax3;
        double totalDeliveryCharge3;
        double totalCost3;

        double weekendTotal;

        final double SALES_TAX = 0.07;
        final double DELIVERY_CHARGE = 0.2;

        Scanner scnr = new Scanner(System.in);

        // section for friday

        /**
         * javadoc comment
         * 
         * blah blah blah
         * 
         * 
         */

        // method: nextInt
        // purpose: This method is used to scan the next token of the input as an
        // integer value.
        System.out.println("Enter number of people eating pizza on Friday night: ");
        numPeople = scnr.nextInt();

        // method: nextDouble
        // purpose: This method is used to scan the next token of the input as a double
        // value.

        System.out.println("Enter number of slices per person: ");
        averageSlices = scnr.nextDouble();
        System.out.println("Enter cost of one whole pizza: ");
        costOfOnePizza = scnr.nextDouble();

        System.out.println("Enter number of people eating pizza on Saturday night: ");
        numPeople2 = scnr.nextInt();
        System.out.println("Enter number of slices per person: ");
        averageSlices2 = scnr.nextDouble();
        System.out.println("Enter cost of one whole pizza: ");
        costOfOnePizza2 = scnr.nextDouble();

        System.out.println("Enter number of people eating pizza on Sunday night: ");
        numPeople3 = scnr.nextInt();
        System.out.println("Enter number of slices per person: ");
        averageSlices3 = scnr.nextDouble();
        System.out.println("Enter cost of one whole pizza: ");
        costOfOnePizza3 = scnr.nextDouble();

        numPizzas = (numPeople * averageSlices) / 8.0;

        // method: Math.ceil
        // purpose: This method returns the smallest floating point value that is
        // greater than or equal to the argument/variable given and is equal to an
        // integer value.

        roundedPizzas = Math.ceil(numPizzas);
        costOfPizzas = costOfOnePizza * roundedPizzas;

        totalSalesTax = costOfPizzas * SALES_TAX;
        totalDeliveryCharge = (totalSalesTax + costOfPizzas) * DELIVERY_CHARGE;

        totalCost = costOfPizzas + totalSalesTax + totalDeliveryCharge;

        // method: println
        // purpose:This method prints the text on the console and the cursor remains at
        // the start of the next line at the console.

        System.out.println("Friday Night Party");
        // method: printf
        // purpose: This method can be used to output a formatted string to the console
        // using various format specifiers like %d, %s, %f, %.2f, %-.2f and more.

        System.out.printf((int) roundedPizzas + " Pizzas: $%.2f\n", costOfPizzas);
        System.out.printf("Tax: $%.2f\n", totalSalesTax);
        System.out.printf("Delivery: $%.2f\n", totalDeliveryCharge);
        System.out.printf("Total: $%.2f\n", totalCost);

        System.out.println("");

        // section for saturday

        numPizzas2 = (numPeople2 * averageSlices2) / 8.0;
        roundedPizzas2 = Math.ceil(numPizzas2);
        costOfPizzas2 = costOfOnePizza2 * roundedPizzas2;

        totalSalesTax2 = costOfPizzas2 * SALES_TAX;
        totalDeliveryCharge2 = (totalSalesTax2 + costOfPizzas2) * DELIVERY_CHARGE;

        totalCost2 = costOfPizzas2 + totalSalesTax2 + totalDeliveryCharge2;

        System.out.println("Saturday Night Party");
        System.out.printf((int) roundedPizzas2 + " Pizzas: $%.2f\n", costOfPizzas2);
        System.out.printf("Tax: $%.2f\n", totalSalesTax2);
        System.out.printf("Delivery: $%.2f\n", totalDeliveryCharge2);
        System.out.printf("Total: $%.2f\n", totalCost2);

        System.out.println("");

        // section for sunday

        numPizzas3 = (numPeople3 * averageSlices3) / 8.0;
        roundedPizzas3 = Math.ceil(numPizzas3);
        costOfPizzas3 = costOfOnePizza3 * roundedPizzas3;

        totalSalesTax3 = costOfPizzas3 * SALES_TAX;
        totalDeliveryCharge3 = (totalSalesTax3 + costOfPizzas3) * DELIVERY_CHARGE;

        totalCost3 = costOfPizzas3 + totalSalesTax3 + totalDeliveryCharge3;

        System.out.println("Sunday Night Party");
        System.out.printf((int) roundedPizzas3 + " Pizzas: $%.2f\n", costOfPizzas3);
        System.out.printf("Tax: $%.2f\n", totalSalesTax3);
        System.out.printf("Delivery: $%.2f\n", totalDeliveryCharge3);
        System.out.printf("Total: $%.2f\n", totalCost3);

        System.out.println("");

        weekendTotal = totalCost + totalCost2 + totalCost3;

        System.out.printf("Weekend Total: $%.2f\n", weekendTotal);

        scnr.close();

    }
}