import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String trash = "";
        double gallon = 0;
        double mile = 0;
        double gas = 0;
        double far = 0;
        double price = 0;

        System.out.print("Enter the amount of gas in your tank: " );

        if(in.hasNextDouble())
        {
            gallon = in.nextDouble();
            in.nextLine();

        }
        else
        {
            trash = in.nextLine();
            System.out.println( trash + " is not a valid number! ");
        }
        System.out.print("Enter the fuel efficiency in miles per gallon: " );

        if(in.hasNextDouble())
        {
            mile = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println( trash + " is not a valid number! ");
        }

        System.out.print("Enter the price of gas per gallon: " );

        if(in.hasNextDouble())
        {
            gas = in.nextDouble();
            in.nextLine();
            price = (100 / mile) * gas;
            far = mile * gallon;
            System.out.println(" Your gas price per 100 miles " + price );
            System.out.println(" Your car can go " + far + " miles with the gas in the tank " );

        }
        else
        {
            trash = in.nextLine();
            System.out.println( trash + " is not a valid number! ");
        }
    }
}
