package lesson2;

public class Slytherin extends Hogwarts {
    private int trickery;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slytherin(String name, String surname, int magicPower, int transgressionRange, int trickery, int resoluteness, int ambition, int resourcefulness, int lustOfPower) {
        super(name, surname, magicPower, transgressionRange);
        this.trickery = trickery;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
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

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
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

    @Override
    public String toString() {
        return  super.toString() + "Хитрость: " + trickery +
                ", Решительность: " + resoluteness +
                ", Амбициозность: " + ambition +
                ", Находчивость: " + resourcefulness +
                ", Жажда власти: " + lustOfPower;
    }
}
