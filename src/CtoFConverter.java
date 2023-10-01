import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        //A program that converts an inputted temperature in C and provides the equivalent temperature in F
        //Hint: Google is your friend!
        //Given C, solve for F
        //Again, check for a valid input value and only respond with the F value if you got it, otherwise loop until you do

        //Testing: 3 conditions: Bad Input, then test for the known freezing and boiling points.

        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        double CTemp = 0.0;
        double FTemp;

        //(0°C × 9/5) + 32 = 32°F

        do
        {
            System.out.print("Enter your C temperature: ");
            if (in.hasNextDouble()) {
                CTemp = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("You entered incorrectly, you typed: " + trash);
            }
        }while(!validInput);

        FTemp = ((CTemp * 1.8) + 32);
        if (FTemp >= 212.0)
        {
            System.out.println("You are boiling at " + FTemp);
        }
        else if (FTemp <= 32.0)
        {
            System.out.println("You are freezing at " + FTemp);
        }
        else
        {
            System.out.println("Your temperature is at " + FTemp);
        }
    }
}