public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("good", "very good", "very good");
        if (success) {
            System.out.println("данные правилны");
        } else {
            System.out.println("данные не правилные");
        }
        Car suzuki = new Car("Suzuki", "XC90", 3.2);
        Car honda = new Car("Honda", "Civic", 3.1);
        Car kia = new Car("Kia", "Sorento", 2.8);


        Truck maz = new Truck("Maz", "5566", 2.2);
        Truck iveco = new Truck("Iveco", "777", 2.5);
        Truck kamaz = new Truck("Kamaz", "333", 3.0);


        Bus man = new Bus("Man", "88", 2.0);
        Bus merseders = new Bus("Merseders", "3377", 3.0);
        Bus ikarus = new Bus("Ikarus", "43", 2.2);

        diagnostics(suzuki, honda, kia, maz, iveco, kamaz, man, merseders, ikarus);

    }

    private static void printInfo(Transport transport) {
        System.out.println(transport.getBrand() + transport.getModel() + transport.getEngineVolume());
    }
   transport.printType();

    private static void diagnostics(Transport... transports) {
        for (int i = 0; i < transports.length; i++) {
            if (!transports[i].diagnostics()) {
                try {
                    throw new RuntimeException("Транспорт" + transports[i].getBrand() + " " + transports[i].getModel()
                            "Не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}