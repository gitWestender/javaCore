package lesson3;

public class Vehicle {

    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


    public void checkEngine() {
    }

    public void updateTyre() {
    }

    public void checkTrailer() {
    }
}
