package carabstractfactory;

import carparts_products.engine.Engine;
import carparts_products.engine.Engine1600cc;
import carparts_products.gear.Gear;
import carparts_products.gear.GearManual;
import carparts_products.wheel.Wheel;
import carparts_products.wheel.Wheel18Inch;

public class CheapCarFactory implements CarPartsFactory{

    @Override
    public Engine createEngine() {
        return new Engine1600cc();
    }

    @Override
    public Gear createGear() {
        return new GearManual();
    }

    @Override
    public Wheel createWheels() {
        return new Wheel18Inch();
    }
}
