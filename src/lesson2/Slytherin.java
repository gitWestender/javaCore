package lesson2;

public class Slytherin extends Hogwarts {

    private int trickery;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slytherin(String name, String surname) {
        super(name, surname);
        this.trickery = getRND();
        this.resoluteness = getRND();
        this.ambition = getRND();
        this.resourcefulness = getRND();
        this.lustOfPower = getRND();
        this.faculty = "Слизерин";
    }

    public int getTrickery() {
        return trickery;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    @Override
    public String toString() {
        return super.toString() + "Хитрость: " + trickery +
                ", Решительность: " + resoluteness +
                ", Амбициозность: " + ambition +
                ", Находчивость: " + resourcefulness +
                ", Жажда власти: " + lustOfPower;
    }

    public int getSumOfPersonalProperties() {
        return getAmbition() + getResoluteness() + getTrickery() + getLustOfPower() + getResourcefulness();
    }

}
