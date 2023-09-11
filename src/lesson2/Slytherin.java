package lesson2;

public class Slytherin extends Hogwarts {
    private int trickery;
    private int resoluteness;
    private int resourcefulness;
    private int lustOfPower;

    public Slytherin(String name, String surname, int trickery, int resoluteness, int resourcefulness, int lustOfPower) {
        super(name, surname);
        this.trickery = trickery;
        this.resoluteness = resoluteness;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }
}
