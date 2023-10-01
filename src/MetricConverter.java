import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        //Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches
        //Again, check for valid input and exit with an error msg if you don’t get it
        //You can look up the conversion formulas with the Web

        //Testing: use some known values here

        Scanner in = new Scanner(System.in);
        String trash;
        boolean validInput = false;

        double meters = 0.0;
        double miles;
        double feet;
        double inches;

        do
        {
            System.out.print("Enter a measurement in meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
            }
        }while(!validInput);

        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.37;

        //rounding so it looks less gross
        miles = Math.round(miles * 1000.0)/ 1000.0;
        feet = Math.round(feet * 1000.0)/ 1000.0;
        inches = Math.round(inches * 1000.0)/ 1000.0;

        System.out.println("From meters to rounded miles: " + miles);
        System.out.println("From meters to rounded feet: " + feet);
        System.out.println("From meters to rounded inches: " + inches);
    }
}
