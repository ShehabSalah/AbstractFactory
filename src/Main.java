public class Main {
    public static void main(String[] args) {
        // create a cheap car
        Car cheapCar = new CheapCar();
        cheapCar.createCar();
        cheapCar.showCarSpecs();

        // create an expensive car
        Car expensiveCar = new ExpensiveCar();
        expensiveCar.createCar();
        expensiveCar.showCarSpecs();
    }
}