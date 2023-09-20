package lesson3;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("c1", 4),
                new Car("c2", 4),
                new Truck("t1", 6),
                new Truck("t2", 8),
                new Bicycle("b1", 2),
                new Bicycle("b2", 2)
        };

        ServiceStation ss = new ServiceStation();

        for (int i = 0; i < vehicles.length; i++) {
            ss.service(vehicles[i]);
        }
    }
}
