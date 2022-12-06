public class Car  extends Transport implements Competing {

 //   private TypeOfBody typeOfBody;


 //   public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
 //       super(brand, model, engineVolume);
//        this.typeOfBody = typeOfBody;
 //   }

 //   public TypeOfBody getTypeOfBody() {
  //      return typeOfBody;
  //  }

 //   public void setTypeOfBody(TypeOfBody typeOfBody) {
 //       this.typeOfBody = typeOfBody;
 //   }

    @Override
    public boolean  diagnostics(){
        return Math.random()> 0.5;
    }


    @Override
    public void startMove() {
        System.out.println("Легковая машина поехала");
    }

    @Override
    public void stopMove() {
        System.out.println("Легковая машина остоновилась");
    }

//    @Override
//    public void printType() {
//        if (typeOfBody == null) {
 //           System.out.println("Данных не недостатоно");
  //      } else {
//            System.out.println(typeOfBody);
 //       }
 //   }

    @Override
    public void pitStop() {
        System.out.println("Пит_стоп для легковой машины");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучший круг легковой машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшее время для легковой машины");
    }

}
