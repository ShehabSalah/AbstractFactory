package carabstractfactory;

import carparts_products.engine.Engine;
import carparts_products.gear.Gear;
import carparts_products.wheel.Wheel;

public interface CarPartsFactory {

    public Engine createEngine();

    public Gear createGear();
    public Wheel createWheels();

}
