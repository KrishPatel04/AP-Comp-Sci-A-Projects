public class CarTrip {
    private double myStartOdometer, myEndOdometer, myTime, myGallonsUsed, milesPerGallon, totalGasPrice;
    private boolean highwayDriving;

    public CarTrip() {

    }

    public CarTrip(double myStartOdometer, double myEndOdometer, double myTime, double myGallonsUsed, double milesPerGallon, boolean highwayDriving) {
        this.myStartOdometer = myStartOdometer;
        this.myEndOdometer = myEndOdometer;
        this.myTime = myTime;
        this.myGallonsUsed = myGallonsUsed;
        this.milesPerGallon = milesPerGallon;
        this.highwayDriving = highwayDriving;
    }

    public void setMyStartOdometer(double newMyStartOdometer) {
        this.myStartOdometer = newMyStartOdometer;
    }

    public void setMyEndOdometer(double newMyEndOdometer) {
        this.myEndOdometer = newMyEndOdometer;
    }

    public void setMyTime(double newMyTime) {
        this.myTime = newMyTime;
    }

    public void setMyGallonsUsed(double newMyGallonsUsed) {
        this.myGallonsUsed = newMyGallonsUsed;
    }

    public void setMilesPerGallon(double newMilesPerGallon) {
        this.milesPerGallon = newMilesPerGallon;
    }

    public void setHighwayDriving(boolean newHighwayDriving) {
        this.highwayDriving = newHighwayDriving;
    }

    public double getMyStartOdometer() {
        return myStartOdometer;
    }

    public double getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public double getMilesPerGallon() {
        highwayMilesPerGallon();
         return milesPerGallon;
    }

    public boolean getHighwayDriving() {
         return highwayDriving;
    }

    // object specific methods
    public double getTripDistance() {
        return myEndOdometer - myStartOdometer; 
    }

    public double getAverageSpeed() {
        return (getTripDistance() / myTime);
    }

    public double getGasMileage() {
        return (getTripDistance() / myGallonsUsed);
    }

    public double getTotalGasPrice(double pricePerGallon) {
        totalGasPrice = ((getTripDistance() / myGallonsUsed) * getGasMileage()); // Fuel cost = (Distance / Consumption) * Cost per gallon
        return totalGasPrice; 
    }

    public void highwayMilesPerGallon() {
        if (highwayDriving) {
            milesPerGallon += 5;
        }
    }

    public String toString() {
        return "A car whose odometer starts at " + this.myStartOdometer + " and ends at " + this.myEndOdometer + " has travled a distance of " + getTripDistance() + ". The time that it took to travel this distance is " + this.myTime + ". The average speed that the car traveled on this trip was " + getAverageSpeed() + ". The number of gallons of gasoline used was " + this.myGallonsUsed + ", meaning you have a gas mileage of " + getGasMileage() + ". During this car trip, you can go " + this.milesPerGallon + " miles per gallon.";
    }
}
