package lesson2;

import java.util.Random;

public class Hogwarts {
    static Random rnd = new Random();

    private String name;
    private String surname;
    private int magicPower;
    private int transgressionRange;

    public Hogwarts(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.magicPower = getRND();
        this.transgressionRange = getRND();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + surname + "\n"
                + "Сила магии: " + magicPower + ", Расстояние трансгрессирования: " + transgressionRange + "\n";
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public static int getRND() {
        return rnd.nextInt(101);
    }

}
