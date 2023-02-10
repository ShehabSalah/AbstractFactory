import carabstractfactory.CarPartsFactory;
import carabstractfactory.CheapCarFactory;
import carparts_products.engine.Engine;
import carparts_products.gear.Gear;
import carparts_products.wheel.Wheel;

public class CheapCar implements Car {

    private Engine engine;
    private Gear gear;
    private Wheel wheel;
    private final CarPartsFactory carPartsFactory = new CheapCarFactory();

    @Override
    public void createCar() {
        engine = carPartsFactory.createEngine();
        gear = carPartsFactory.createGear();
        wheel = carPartsFactory.createWheels();
    }

    @Override
    public void showCarSpecs() {
        System.out.println("Cheap car specs:");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("Gear: " + gear.getGearType());
        System.out.println("Wheel: " + wheel.getWheelSize());
    }
}
