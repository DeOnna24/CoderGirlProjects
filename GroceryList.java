import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");

        String line1;
        out.println("Item 1?\n");
        line1 = keyboard.nextLine();

        String line2;
        out.println("Item 2?\n");
        line2 = keyboard.nextLine();

        String line3;
        out.println("Item 3?\n");
        line3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");

        int count1;
        out.println("How many " + line1 + "?\n");
        count1 = keyboard.nextInt();
        keyboard.skip("\n");

        int count2;
        out.println("How many " + line2 + "?\n");
        count2 = keyboard.nextInt();
        keyboard.skip("\n");

        int count3;
        out.println("How many " + line3 + "?\n");
        count3 = keyboard.nextInt();
        keyboard.skip("\n");

        out.println("Now, please enter the price of each item.");

        float meters1;
        out.println("How much does one " + line1 + " cost?\n");
        meters1 = keyboard.nextFloat();
        keyboard.skip("\n");

        float meters2;
        out.println("How much does one " + line2 + " cost?\n");
        meters2 = keyboard.nextFloat();
        keyboard.skip("\n");

        float meters3;
        out.println("How much does one " + line3 + " cost?\n");
        meters3 = keyboard.nextFloat();
        keyboard.skip("\n");

        float total;
        total = (count1 * meters1) + (count2 * meters2) + (count3 * meters3);
        out.println("Calculating your grocery bill.\n");
        out.println("Your total cost is " + total +"");
    }
}
