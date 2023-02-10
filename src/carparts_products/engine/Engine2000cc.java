package carparts_products.engine;

public class Engine2000cc extends Engine {

    public Engine2000cc() {
        System.out.println("2000cc Engine created");
        setEngineType("2000cc");
    }

    @Override
    protected void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
