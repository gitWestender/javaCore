package lesson2;

import java.util.Random;

public class Hogwarts {

    static Random rnd = new Random();

    protected String faculty;

    private String name;
    private String surname;
    private int magicPower;
    private int transgressionRange;

    public Hogwarts() {
    }

    public Hogwarts(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.magicPower = getRND();
        this.transgressionRange = getRND();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + surname + "\n"
                + "Сила магии: " + magicPower + ", Расстояние трансгрессирования: " + transgressionRange + "\n";
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public int getRND() {
        return rnd.nextInt(101);
    }

    public int getSumOfMagicProperties() {
        return getMagicPower() + getTransgressionRange();
    }

    public int getSumOfPersonalProperties() {
        return 0;
    }

    public void studEquals(Hogwarts hg1, Hogwarts hg2) {
        if (hg1.getClass() == hg2.getClass()) {
            studEqualsOnPersonalProperties(hg1, hg2);
        } else {
            studEqualsOnMagicProperties(hg1, hg2);
        }
    }

    protected void studEqualsOnMagicProperties(Hogwarts hg1, Hogwarts hg2) {
        if (hg1.getSumOfMagicProperties() > hg2.getSumOfMagicProperties()) {
            System.out.printf("\n%s(%d) обладает большей мощностью, чем %s(%d)",
                    hg1.getName(), hg1.getSumOfMagicProperties(), hg2.getName(), hg2.getSumOfMagicProperties());
        } else {
            System.out.printf("\n%s(%d) обладает большей мощностью, чем %s(%d)",
                    hg2.getName(), hg2.getSumOfMagicProperties(), hg1.getName(), hg1.getSumOfMagicProperties());
        }
    }

    protected void studEqualsOnPersonalProperties(Hogwarts hg1, Hogwarts hg2) {
        if (hg1.getSumOfPersonalProperties() > hg2.getSumOfPersonalProperties()) {
            System.out.printf("\n%s(%d) лучший студент %s, чем %s(%d)",
                    hg1.getName(), hg1.getSumOfPersonalProperties(), hg1.faculty, hg2.getName(), hg2.getSumOfPersonalProperties());
        } else {
            System.out.printf("\n%s(%d) лучший студент %s, чем %s(%d)",
                    hg2.getName(), hg2.getSumOfPersonalProperties(), hg2.faculty, hg1.getName(), hg1.getSumOfPersonalProperties());
        }
    }

}
