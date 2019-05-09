
class Temperatures {

    public static void main(String[] args) {

        System.out.println("The data provided are:");

        int grid[][] = {
                {68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72},
        };

        String[] days = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"};

        String[] times = {"7 AM", "3 PM", "7 PM", "3 AM"};

        for (int row = 0; row < 4; row++) {

            System.out.print(times[row] + " ");

            for (int column = 0; column < 7; column++) {

                System.out.print(days[column] + " ");

                System.out.print(grid[row][column] + " ");

            }

            System.out.println();

        }

        //Average temperature per day.


//        for(int Average); {
//
//            System.out.print("Based on that data, the following are the average temperatures for the week.");
//            System.out.println("Sun: " + );
//
//
//        }

        System.out.println();
        System.out.println("Based on that data, the following are the average temperatures for the week.");
        System.out.println();

        int average = 0;

        for (int column = 0; column < 7; column++) {


            for (int row = 0; row < 4; row++) {

                average += grid[row][column];
            }

            System.out.println(days[column] + ": " + average / 4);

            average = 0;

        }

        System.out.println();

        for (int row = 0; row < 4; row++) {

            for (int column = 0; column < 7; column++) {

                average += grid[row][column];
            }

            System.out.println(times[row] + ": " + average / 7);

            average = 0;

        }

        for (int row = 0; row < 4; row++) {

            for (int column = 0; column < 7; column++) {

                average += grid[row][column];
            }
        }

        System.out.println();
        System.out.println("The final average temperature for the week was: ");
        System.out.println();
        System.out.println("Overall: " + average / 28);
    }
}
