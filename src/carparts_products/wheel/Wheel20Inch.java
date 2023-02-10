package carparts_products.wheel;

public class Wheel20Inch extends Wheel {

    public Wheel20Inch() {
        System.out.println("20 inch Wheel added to the car");
        setWheelSize("20 inch");
    }

    @Override
    protected void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }
}
