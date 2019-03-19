import java.util.Scanner;

public class PrintTheMultiplicationTable {

    public static void main(String[] args) {

        int size;
        System.out.println("What size would you like to print for the multiplication table from 1 - 20?");
        Scanner keyboard = new Scanner(System.in);
        size = keyboard.nextInt();

        for (int x = 0; x <= size; x++) {

            for (int y = 0; y <= size; y++) {

                System.out.println(x + "*" + y + "=" + (size * (x + y)));
            }
        }
        System.out.println();
    }
}