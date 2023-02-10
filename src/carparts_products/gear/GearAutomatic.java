package carparts_products.gear;

public class GearAutomatic extends Gear {

    public GearAutomatic() {
        System.out.println("Automatic Gear attached to the car");
        setGearType("Automatic");
    }

    @Override
    protected void setGearType(String gearType) {
        this.gearType = gearType;
    }
}
