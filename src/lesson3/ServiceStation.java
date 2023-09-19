package lesson3;

public class ServiceStation {
    public void service(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            ((Car) vehicle).service();
        } else if (vehicle instanceof Truck) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            ((Truck) vehicle).service();
        } else if (vehicle instanceof Vehicle) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            ((Bicycle) vehicle).service();
        }
    }
}
