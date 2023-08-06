public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRate, int numberOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRate);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and setter for numberOfDoors

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (numberOfDoors > 2) {
            return super.calculateRentalCost(days) + (35 * days);
        } else {
            return super.calculateRentalCost(days);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numberOfDoors;
    }
}
