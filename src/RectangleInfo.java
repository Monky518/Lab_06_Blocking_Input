import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        //Write a program that asks the user for the lengths of the sides of a rectangle. Again, loop the input until it is valid
        //(Note only two measure here, the Width and the Height…)

        //Testing: use some simple values to confirm that the calculations are correct
        // The area and perimeter of the rectangle
        // The length of the diagonal (use the Pythagorean theorem)
        //Note: a 3 by 4 rectangle will have diagonal of 5

        Scanner in = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;

        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;

        String trash;
        boolean validInput = false;

        //get length
        do
        {
            System.out.print("Rectangle length: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
            }
        }while(!validInput);

        //get width
        do
        {
            validInput = false;
            System.out.print("Rectangle width: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
            }
        }while(!validInput);

        //math time
        area = length * width;
        perimeter = (2 * length) + (2 * width);
        diagonal = Math.sqrt((Math.pow(length, 2)) + (Math.pow(width, 2)));

        //rounding so it looks less gross
        area = Math.round(area*100.0)/100.0;
        perimeter = Math.round(perimeter*100.0)/100.0;
        diagonal = Math.round(diagonal*100.0)/100.0;

        System.out.println("Your rectangle area is " + area);
        System.out.println("Your rectangle perimeter is " + perimeter);
        System.out.println("Your rectangle diagonal is " + diagonal);
    }
}
