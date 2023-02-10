import carabstractfactory.CarPartsFactory;
import carabstractfactory.ExpensiveCarFactory;
import carparts_products.engine.Engine;
import carparts_products.gear.Gear;
import carparts_products.wheel.Wheel;

public class ExpensiveCar implements Car {
    private Engine engine;
    private Gear gear;
    private Wheel wheel;
    private final CarPartsFactory carPartsFactory = new ExpensiveCarFactory();

    @Override
    public void createCar() {
        engine = carPartsFactory.createEngine();
        gear = carPartsFactory.createGear();
        wheel = carPartsFactory.createWheels();
    }

    @Override
    public void showCarSpecs() {
        System.out.println("Expensive car specs:");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("Gear: " + gear.getGearType());
        System.out.println("Wheel: " + wheel.getWheelSize());
    }
}
