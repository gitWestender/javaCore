package lesson2;

import java.util.Random;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname) {
        super(name, surname);
        this.nobility = getRND();
        this.honor = getRND();
        this.bravery = getRND();
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "Благородство: " + nobility +
                ", Честь: " + honor +
                ", Отвага: " + bravery;
    }

    public int sumOfPersonalFutures() {
        return getBravery() + getHonor() + getNobility();
    }

}