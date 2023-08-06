import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("C001", "Toyota", "Camry", 100, 4);
        vehicles[1] = new Motorcycle("M001", "Honda", "CBR500R", 80, 500);
        vehicles[2] = new Car("C002", "Honda", "Civic", 120, 2);
        vehicles[3] = new Motorcycle("M002", "Kawasaki", "Ninja 300", 70, 200);

        System.out.print("Enter the number of rental days: ");
        int rentalDays = scanner.nextInt();

        System.out.println("\nRental Details:");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Rental Cost for " + rentalDays + " days: RM" + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Motorcycle) {
                System.out.println("Top Speed: " + ((Motorcycle) vehicle).calculateTopSpeed() + " km/h");
            }

            System.out.println();
        }
        scanner.close();
    }
}
