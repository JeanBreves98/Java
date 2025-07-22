import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter type (G for Gas, E for Electric, H for hybrid, or Q to quit):");
            String type = s.nextLine();
            if ("Gg".contains(type)) {
                System.out.print("Enter make:");
                String make = s.nextLine();
                System.out.print("Enter model:");
                String model = s.nextLine();
                System.out.print("Enter color:");
                String color = s.nextLine();
                System.out.print("Enter number of doors:");
                int doors = Integer.parseInt(s.nextLine());
                System.out.print("Enter average fuel consumption:");
                double avgKm = Double.parseDouble(s.nextLine());
                System.out.print("Enter number of cylinders:");
                int cylinders = Integer.parseInt(s.nextLine());
                Car gasCar = new GasPoweredCar(make, model, color, doors, avgKm, cylinders);
                gasCar.startEngine();
                gasCar.drive();
            } else if("Hh".contains(type)) {
                System.out.print("Enter make:");
                String make = s.nextLine();
                System.out.print("Enter model:");
                String model = s.nextLine();
                System.out.print("Enter color:");
                String color = s.nextLine();
                System.out.print("Enter number of doors:");
                int doors = Integer.parseInt(s.nextLine());
                System.out.print("Enter average fuel consumption:");
                double avgKm = Double.parseDouble(s.nextLine());
                System.out.print("Enter number of battery size:");
                int battery = Integer.parseInt(s.nextLine());
                System.out.print("Enter number of cylinders:");
                int cylinders = Integer.parseInt(s.nextLine());
                Car hybridCar = new HybridCar(make, model, color, doors, avgKm, battery, cylinders);
                hybridCar.startEngine();
                hybridCar.drive();
            } else if("Ee".contains(type)) {
                System.out.print("Enter make:");
                String make = s.nextLine();
                System.out.print("Enter model:");
                String model = s.nextLine();
                System.out.print("Enter color:");
                String color = s.nextLine();
                System.out.print("Enter number of doors:");
                int doors = Integer.parseInt(s.nextLine());
                System.out.print("Enter average fuel consumption:");
                double avgKm = Double.parseDouble(s.nextLine());
                System.out.print("Enter number of battery size:");
                int battery = Integer.parseInt(s.nextLine());
                Car electricCar = new ElectricCar(make, model, color, doors, avgKm, battery);
                electricCar.startEngine();
                electricCar.drive();
            } else if("Qq".contains(type)) {
                break;
            }
        }
    }
}