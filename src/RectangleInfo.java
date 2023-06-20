import java.util.Scanner;

import static java.lang.Math.sqrt;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int width = 0;
        int height = 0;
        int perimeter = 0;
        int area = 0;
        double diagonal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if(in.hasNextInt())
            {
                width = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Try again.");
            }
        }while (!done);

        done = false;

        do
        {
            System.out.print("Enter the height of the rectangle: ");
            if(in.hasNextInt())
            {
                height = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Try again.");
            }
        }while (!done);

        perimeter = 2 * (width + height);
        area = width * height;
        diagonal = Math.sqrt((width * width) + (height * height));
        System.out.println("The perimeter of the rectangle is " + perimeter + ", while the area is " + area);
        System.out.println("The diagonal is " + diagonal);

    }
}
