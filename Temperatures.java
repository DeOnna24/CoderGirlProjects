
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

        for(int column = 0; column < 7; column++) {



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

//        System.out.println((68+76+73+64)/4);
//        int AverageMonday = (70+76+72+65)/4;
//        int AverageTuesday = (76+87+81+69)/4;
//        int AverageWednesday = (70+84+78+68)/4;
//        int AverageThursday = (68+82+76+70)/4;
//        int AverageFriday = (71+75+73+74)/4;
//        int AverageSaturday = (75+83+77+72)/4;
//
//        System.out.println();
//        System.out.println("Based on that data, the following are the average temperatures for the week.");
//        System.out.println("Sun: " + (average));
//        System.out.println("Mon: " + (AverageMonday));
//        System.out.println("Tue: " + (AverageTuesday));
//        System.out.println("Wed: " + (AverageWednesday));
//        System.out.println("Thu: " + (AverageThursday));
//        System.out.println("Fri: " + (AverageFriday));
//        System.out.println("Sat: " + (AverageSaturday));
//        System.out.println();
//
//        //Avereage temperature per time.
//
//        int Average7AM = (68+70+76+70+68+71+75)/7;
//        int Average3PM = (76+76+87+84+82+75+83)/7;
//        int Average7PM = (73+72+81+78+76+73+77)/7;
//        int Average3AM = (64+65+69+68+70+74+72)/7;
//
//        System.out.println("7 AM: " + (Average7AM));
//        System.out.println("3 PM: " + (Average3PM));
//        System.out.println("7 PM: " + (Average7PM));
//        System.out.println("3 AM: " + (Average3AM));
//        System.out.println();
//
//        //Average temperature overall.
//
//        int AverageTempOverall = (68+76+73+64+70+76+72+65+76+87+81+69+70+84+78+68+68+82+76+70+71+75+73+74+75+83+77+72)/28;
//
//        System.out.println("The final average temperature for the week was: ");
//        System.out.println("Overall: " + (AverageTempOverall));
}

}
