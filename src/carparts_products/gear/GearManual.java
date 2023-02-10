package carparts_products.gear;

public class GearManual extends Gear {

    public GearManual() {
        System.out.println("Manual Gear attached to the car");
        setGearType("Manual");
    }

    @Override
    protected void setGearType(String gearType) {
        this.gearType = gearType;
    }
}
