public abstract class Transport {
    private final String brand;

    private final String model;

    public double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank()){
            this.brand="default";
        }else {
            this.brand = brand;
        }
        if(model==null || model.isBlank()){
            this.model="default";
        }else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
    }


    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public double getEngineVolume() {return engineVolume;}

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.6;
        }else{
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void printType();

    public abstract boolean diagnostics();
}
