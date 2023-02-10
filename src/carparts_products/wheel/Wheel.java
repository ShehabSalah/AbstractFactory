package carparts_products.wheel;

public abstract class Wheel {

    protected String wheelSize;

    protected abstract void setWheelSize(String wheelSize);

    public String getWheelSize() {
        return wheelSize;
    }

}
