public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;

    public Car(String make, String model, String color, int doors) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;

    }

    public void startEngine() {
        System.out.printf("Starting the engine of %s %s %s%n", color, make, model);
        runEngine();
    }

    public void drive() {
        System.out.printf("Driving the %s with %d%n", model, doors);
    }

    protected void runEngine() {
        System.out.println("Engine running...");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

class GasPoweredCar extends  Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String make, String model, String color, int doors, double avgKmPerLitre, int cylinders) {
        super(make, model, color, doors);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Igniting %d cylinders of gas engine in %s %s%n", cylinders, getMake(), getModel());
        runEngine();
    }

    @Override
    public void drive() {
        System.out.printf("%s in motion. Fuel efficiency %f km/Ln%n",getClass().getSimpleName(), avgKmPerLitre);
    }

    @Override
    protected void runEngine() {
        System.out.println("Purring gas engine... smooth combustion");
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String make, String model, String color, int doors, double avgKmPerCharge, int batterySize) {
        super(make, model, color, doors);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Booting up electric motor with %d%% charge%n", batterySize);
        runEngine();
    }

    @Override
    public void drive() {
        System.out.printf("%s in motion. Can go %f km on current charge%n",getClass().getSimpleName(), avgKmPerCharge);
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric hum... Zero emissions");
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String make, String model, String color, int doors, double avgKmPerLitre, int batterySize, int cylinders) {
        super(make, model, color, doors);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Activating hybrid system. %d cylinders + %d KWh%n", cylinders, batterySize);
        runEngine();
    }

    @Override
    public void drive() {
        System.out.printf("%s in motion. Smart drive using both fuel and electricity%n", getClass().getSimpleName());
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid engine balancing power sources...");

    }
}