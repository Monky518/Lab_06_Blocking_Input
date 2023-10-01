import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        //Write a program that asks the user to input (should all be type double)
        // The number of gallons of gas in the tank
        // The fuel efficiency in miles per gallon
        // The price of gas per gallon
        //Again use a do loop structure for each variable (3 here!)
        //Then print the cost per 100 miles and how far the car can go with the gas in the tank

        //Testing: here just use some reasonable values that you can inspect the calculations and determine they are correct

        Scanner in = new Scanner(System.in);

        double tankGallons = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;

        double hundredMileTest;
        double distanceTest;

        String trash;
        boolean validInput = false;

        //The number of gallons of gas in the tank
        do
        {
            System.out.print("Gallons of gas your car holds: ");
            if (in.hasNextDouble())
            {
                tankGallons = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
            }
        }while(!validInput);

        //The fuel efficiency in miles per gallon
        do
        {
            //reset for next test
            validInput = false;
            System.out.print("Your car's miles per gallon: ");
            if (in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
            }
        }while(!validInput);

        //The price of gas per gallon
        do
        {
            //reset for next test
            validInput = false;
            System.out.print("Price of gas per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
            }
        }while(!validInput);

        //testing and answer time!
        hundredMileTest = (100 / milesPerGallon) * pricePerGallon;
        distanceTest = tankGallons * milesPerGallon;

        //rounding so it looks less gross
        hundredMileTest = Math.round(hundredMileTest*100.0)/100.0;
        distanceTest = Math.round(distanceTest*100.0)/100.0;

        System.out.println("The cost to go 100 miles with your car and current gas price is $" + hundredMileTest);
        System.out.println("On a full tank, your car can go " + distanceTest + " miles.");
    }
}
