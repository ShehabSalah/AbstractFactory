package carparts_products.engine;

public abstract class Engine {

    protected String engineType;

    protected abstract void setEngineType(String engineType);

    public String getEngineType() {
        return engineType;
    }

}
