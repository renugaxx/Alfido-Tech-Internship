class Vehicle {
    protected String brand;
    protected int wheels;
    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    public void describe() {
        System.out.println("This is a " + brand + " vehicle with " + wheels + " wheels.");
    }
}
class Car extends Vehicle {
    private boolean isElectric;

    public Car(String brand, boolean isElectric) {
        super(brand, 4); 
        this.isElectric = isElectric;
    }
    @Override
    public void describe() {
        String type = isElectric ? "electric" : "gas-powered";
        System.out.println("Car: " + brand + " - " + type + " with " + wheels + " wheels.");
    }
}
class Bicycle extends Vehicle {
    private boolean hasGear;
    public Bicycle(String brand, boolean hasGear) {
        super(brand, 2); 
        this.hasGear = hasGear;
    }
    @Override
    public void describe() {
        String gearInfo = hasGear ? "with gears" : "without gears";
        System.out.println("Bicycle: " + brand + " - " + gearInfo + " and " + wheels + " wheels.");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle("GenericBrand", 3);
        Car tesla = new Car("Tesla", true);
        Bicycle heroBike = new Bicycle("Hero", true);
        genericVehicle.describe();
        tesla.describe();
        heroBike.describe();
    }
}
