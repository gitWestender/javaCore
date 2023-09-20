package lesson3;

public class Bicycle extends Vehicle{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        if (this != null) {
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
        }
    }
}
