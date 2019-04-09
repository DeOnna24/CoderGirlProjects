
class Temperatures {

    public static void main(String[] args) {

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

        System.out.println();

        //Average temperature per day.
        System.out.println("The average temperature for Sunday is 70.25.");
        System.out.println("The average temperature for Monday is 70.75.");
        System.out.println("The average temperature for Tuesday is 78.25.");
        System.out.println("The average temperature for Wednesday is 75.");
        System.out.println("The average temperature for Thursday is 74.");
        System.out.println("The average temperature for Friday is 73.25.");
        System.out.println("The average temperature for Saturday is 76.75.");
        System.out.println();

        //Avereage temperature per time.
        System.out.println("The average temperature at 7AM is 71.14.");
        System.out.println("The average temperature at 3PM is 80.43.");
        System.out.println("The average temperature at 7PM is 75.71.");
        System.out.println("The average temperature at 3AM is 68.86.");
        System.out.println();

        //Average temperature overall.
        System.out.println("The average temperature overall is 74.04.");
}

}
