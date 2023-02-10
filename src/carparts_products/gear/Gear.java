package carparts_products.gear;

public abstract class Gear {

    protected String gearType;

    protected abstract void setGearType(String gearType);

    public String getGearType() {
        return gearType;
    }
}
