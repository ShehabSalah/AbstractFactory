package carabstractfactory;

import carparts_products.engine.Engine;
import carparts_products.engine.Engine2000cc;
import carparts_products.gear.Gear;
import carparts_products.gear.GearAutomatic;
import carparts_products.wheel.Wheel;
import carparts_products.wheel.Wheel20Inch;

public class ExpensiveCarFactory implements CarPartsFactory {

    @Override
    public Engine createEngine() {
        return new Engine2000cc();
    }

    @Override
    public Gear createGear() {
        return new GearAutomatic();
    }

    @Override
    public Wheel createWheels() {
        return new Wheel20Inch();
    }
}
