public class Bus extends Transport implements Competing {

//    private Capacity capacity;


    //   public Bus(String brand, String model, double engineVolume, Capacity capacity) {
    //       super(brand, model, engineVolume);
    //       this.capacity = capacity;
    //   }

//    public Capacity getCapacity() {
    //       return capacity;
    //   }

    //   public void setCapacity(Capacity capacity) {
    //       this.capacity = capacity;
    //   }


    @Override
    public void startMove() {
        System.out.println("Автобус поехала");
    }

    @Override
    public void stopMove() {
        System.out.println("Автобус остоновилась");
    }

    //   @Override
    //  public void printType() {
    //       if (capacity == null) {
    //           System.out.println("Данных не недостатоно");
    //       } else {
    //           System.out.println(capacity.getFrom() + " " + capacity.getTo());

    @Override
    public boolean diagnostics(){
        System.out.println("Автобус" + getBrand()+ getModel()+ " в диагностике не требуется");
        return true;

    @Override
    public void pitStop() {
        System.out.println("Пит_стоп для Автобус ");}
    }

    @Override
    public void bestTime() {
        System.out.println("Лучший круг Автобус ");}
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшее время для Автобус ");}
    }
}

