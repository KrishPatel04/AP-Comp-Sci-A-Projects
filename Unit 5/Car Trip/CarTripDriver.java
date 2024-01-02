public class CarTripDriver {
    public static void main(String[] args) throws Exception {
        CarTrip trip1 = new CarTrip();
        CarTrip trip2 = new CarTrip(10, 20, 2, 2, 5, true);

        /*
         * Call at least 6 methods (including the toString()) with each object
         * Call the toString method with each object
         */

        System.out.println("-------------Trip 1:-------------");
        System.out.println("- Odometer start: " + trip1.getMyStartOdometer());
        System.out.println("- Odometer end: " + trip1.getMyEndOdometer());
        System.out.println("- Trip time: " + trip1.getMyTime());
        System.out.println("- Gallons used: " + trip1.getMyGallonsUsed());
        System.out.println("- Miles per gallon: " + trip1.getMilesPerGallon());
        System.out.println("- Driving on highway status: " + trip1.getHighwayDriving());
        System.out.println();
        System.out.println(trip1);

        // trip 2 print outs
        System.out.println("\n-------------Trip 2:-------------");
        System.out.println("- Odometer start: " + trip2.getMyStartOdometer());
        System.out.println("- Odometer end: " + trip2.getMyEndOdometer());
        System.out.println("- Trip time: " + trip2.getMyTime());
        System.out.println("- Gallons used: " + trip2.getMyGallonsUsed());
        System.out.println("- Miles per gallon: " + trip2.getMilesPerGallon());
        System.out.println("- Driving on highway status: " + trip2.getHighwayDriving());
        System.out.println();
        System.out.println(trip2);
    }
}