import java.util.Scanner;

class ShippingCalculator {
    private double shippingCost;
    
    public ShippingCalculator() {
        shippingCost = 0.0;
    }

    public void calculateShippingCost(int weightInKg) {
        shippingCost = weightInKg * 5.0;
    }

    public void calculateShippingCost(double weightInGrams) {
        shippingCost = weightInGrams * 0.005;
    }

    public void calculateShippingCost(String category) {
        switch (category.toLowerCase()) {
            case "light":
                shippingCost = 10.0;
                break;
            case "medium":
                shippingCost = 20.0;
                break;
            case "heavy":
                shippingCost = 50.0;
                break;
            default:
                System.out.println("Invalid category!");
                shippingCost = 0.0;
        }
    }

    public void displayShippingCost() {
        System.out.println("Shipping Cost: $" + shippingCost);
    }

    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        ShippingCalculator sc = new ShippingCalculator();

        System.out.println("Choose input type:");
        System.out.println("1. Weight in Kilograms");
        System.out.println("2. Weight in Grams");
        System.out.println("3. Weight Category (light/medium/heavy)");
        System.out.print("Enter your choice: ");

        int choice = scInput.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter weight in kilograms: ");
                int kg = scInput.nextInt();
                sc.calculateShippingCost(kg);
                break;

            case 2:
                System.out.print("Enter weight in grams: ");
                double grams = scInput.nextDouble();
                sc.calculateShippingCost(grams);
                break;

            case 3:
                System.out.print("Enter category (light/medium/heavy): ");
                scInput.nextLine();
                String category = scInput.nextLine();
                sc.calculateShippingCost(category);
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        sc.displayShippingCost();
        scInput.close();
    }
}
