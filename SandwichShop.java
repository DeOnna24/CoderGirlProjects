import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args) {
        // Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        // Your code goes below here.
        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        int VeggiesSold = keyboard.nextInt();
        out.println();
        if (VeggiesSold >= 50) {
            out.println("Made goal for veggies.");
        }
        else {
            out.println("Fell short for veggies.");
        }

        out.println("The sales goal for burgers is 250.");
        out.println("How many burgers were sold today?");
        int BurgersSold = keyboard.nextInt();
        out.println();
        if (BurgersSold >= 250)
        {
            out.println("Made goal for burgers.");
        }
        else {
            out.println("Fell short for burgers.");
        }
        out.println("The sales goal for subs is 180.");
        out.println("How many subs were sold today?");
        int SubsSold = keyboard.nextInt();
        out.println();
        if (SubsSold >= 180) {
            out.println("Made goal for subs.");
        }
        else {
            out.println("Fell short for subs.");
        }
        out.println("The sales goal for soup is 70.");
        out.println("How many soups were sold today?");
        int SoupSold = keyboard.nextInt();
        out.println();
        if (SoupSold >= 70) {
            out.println("Made goal for soup.");
        }
        else {
            out.println("Fell short for soup.");
        }
        out.println();
        if (VeggiesSold >= 50 && BurgersSold >= 250 && SubsSold >= 180 && SoupSold >= 70)
        {
            out.println("Made goal for everything!");
        }
    }
}
