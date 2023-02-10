package carparts_products.engine;

public class Engine1600cc extends Engine {

    public Engine1600cc() {
        System.out.println("1600cc Engine created");
        setEngineType("1600cc");
    }

    @Override
    protected void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
