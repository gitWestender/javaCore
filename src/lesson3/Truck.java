package lesson3;

public class Truck extends VehicleWtihEngine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void service() {
        if (this != null) {
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
            this.checkTrailer();
        }
    }
}
