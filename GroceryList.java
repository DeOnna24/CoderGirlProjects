import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");

        String line1;
        out.print("Item 1? ");
        line1 = keyboard.nextLine();
        out.println();
        String line2;
        out.print("Item 2? ");
        line2 = keyboard.nextLine();
        out.println();
        String line3;
        out.print("Item 3? ");
        line3 = keyboard.nextLine();
        out.println();
        out.println("Now, please enter the quantity of each item.");

        int count1;
        out.print("How many " + line1 + "? ");
        count1 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();
        int count2;
        out.print("How many " + line2 + "? ");
        count2 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();
        int count3;
        out.print("How many " + line3 + "? ");
        count3 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();
        out.println("Now, please enter the price of each item.");

        float meters1;
        out.print("How much does one " + line1 + " cost? ");
        meters1 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();
        float meters2;
        out.print("How much does one " + line2 + " cost? ");
        meters2 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();
        float meters3;
        out.print("How much does one " + line3 + " cost? ");
        meters3 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();
        float total;
        total = (count1 * meters1) + (count2 * meters2) + (count3 * meters3);
        out.print("Calculating your grocery bill.\n");
        out.print("Your total cost is " + total +"");
    }
}
