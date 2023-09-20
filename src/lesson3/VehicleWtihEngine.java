package lesson3;

public abstract class VehicleWtihEngine extends Vehicle{

    public VehicleWtihEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
