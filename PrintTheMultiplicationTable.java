import java.util.Scanner;

public class PrintTheMultiplicationTable {

    public static void main(String[] args) {

        int size;
        System.out.println("What size would you like to print for the multiplication table?");
        Scanner keyboard = new Scanner (System.in);
        size = keyboard.nextInt();

        for (int x = 0; x <= 20; x ++) {

            for (int y = 0; y <= 20; y++) {

                System.out.println(x + "*" + y + "=" + (x*y));

            }
            System.out.println();
        }