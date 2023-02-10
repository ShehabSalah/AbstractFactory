package carparts_products.wheel;

public class Wheel18Inch extends Wheel {

    public Wheel18Inch() {
        System.out.println("18 inch Wheel added to the car");
        setWheelSize("18 inch");
    }

    @Override
    protected void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }
}
