package lesson3;

public class Car extends VehicleWtihEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        if (this != null) {
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
        }
    }
}
