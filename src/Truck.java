public class Truck  extends Transport implements Competing {

//    private Weight weight;


//    public Truck(String brand, String model, double engineVolume, Weight weight) {
//        super(brand, model, engineVolume);
//        this.weight = weight;

//    }

//    public Weight getWeight() {
//        return weight;
//    }

//    public void setWeight(Weight weight) {
//        this.weight = weight;
//    }
@Override
public boolean diagnostics();
    return Math.random() >0.75;


    @Override
    public void startMove() {
        System.out.println("Грузавая машина поехала");
    }

    @Override
    public void stopMove() {
        System.out.println("Грузавая машина остоновилась");
    }


    @Override
    public void pitStop() {
        System.out.println("Пит_стоп для грузавой машины");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучший круг грузавой  машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшее время для грузавой  машины");
    }


}

