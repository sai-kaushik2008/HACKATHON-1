import java.util.Scanner;

public class MunicipalWasteOptimizer {

    
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
       
        int vehicleNumber = 101; 
        double wasteCollected = 150.50; 
        int collectionPoints = 12; 
        char vehicleStatus = 'A';

        
        System.out.println("=== Vehicle Details (3a) ===");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();

       
        System.out.println("=== Waste Target Status (3b) ===");
        System.out.print("Enter current waste collected (in kg): ");
        double currentWaste = scanner.nextDouble();

      
        if (currentWaste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        System.out.println();

        
        System.out.println("=== Total Waste Calculation (3c) ===");
        System.out.print("Enter waste from Collection Point 1 (in kg): ");
        double point1Waste = scanner.nextDouble();

        System.out.print("Enter waste from Collection Point 2 (in kg): ");
        double point2Waste = scanner.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        scanner.close();
    }
}