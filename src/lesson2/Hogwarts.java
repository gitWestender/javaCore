package lesson2;

import java.util.Random;

public class Hogwarts {
    static Random rnd = new Random();

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

    public int sumOfProperties() {
        return getMagicPower() + getTransgressionRange();
    }

    public void gryffindorEquals(Gryffindor gr1, Gryffindor gr2) {
        if (gr1.sumOfProperties() > gr2.sumOfProperties()) {
            System.out.printf("\n%s(%d) лучший студент Гриффиндора, чем %s(%d)",
                    gr1.getName(), gr1.sumOfProperties(), gr2.getName(), gr2.sumOfProperties());
        } else {
            System.out.printf("\n%s(%d) лучший студент Гриффиндора, чем %s(%d)",
                    gr2.getName(), gr2.sumOfProperties(), gr1.getName(), gr1.sumOfProperties());
        }
    }

    public void slytherinEquals(Slytherin sl1, Slytherin sl2) {
        if (sl1.sumOfProperties() > sl2.sumOfProperties()) {
            System.out.printf("\n%s(%d) лучший студент Слизерина, чем %s(%d)",
                    sl1.getName(), sl1.sumOfProperties(), sl2.getName(), sl2.sumOfProperties());
        } else {
            System.out.printf("\n%s(%d) лучший студент Слизерина, чем %s(%d)",
                    sl2.getName(), sl2.sumOfProperties(), sl2.getName(), sl2.sumOfProperties());
        }
    }

    public void hufflepufEquals(Hufflepuff hf1, Hufflepuff hf2) {
        if (hf1.sumOfProperties() > hf2.sumOfProperties()) {
            System.out.printf("\n%s(%d) лучший студент Пуффендуя, чем %s(%d)",
                    hf1.getName(), hf1.sumOfProperties(), hf2.getName(), hf2.sumOfProperties());
        } else {
            System.out.printf("\n%s(%d) лучший студент Пуффендуя, чем %s(%d)",
                    hf2.getName(), hf2.sumOfProperties(), hf1.getName(), hf1.sumOfProperties());
        }
    }

    public void ravenclawEquals(Ravenclaw rc1, Ravenclaw rc2) {
        if (rc1.sumOfProperties() > rc2.sumOfProperties()) {
            System.out.printf("\n%s(%d) лучший студент Когтеврана, чем %s(%d)",
                    rc1.getName(), rc1.sumOfProperties(), rc2.getName(), rc2.sumOfProperties());
        } else {
            System.out.printf("\n%s(%d) лучший студент Когтеврана, чем %s(%d)",
                    rc2.getName(), rc2.sumOfProperties(), rc1.getName(), rc1.sumOfProperties());
        }
    }

    public static void studEquals(Hogwarts hg1, Hogwarts hg2) {
        if (hg1.sumOfProperties() > hg2.sumOfProperties()) {
            System.out.printf("\n%s(%d) лучший студент , чем %s(%d)",
                    hg1.getName(), hg1.sumOfProperties(), hg2.getName(), hg2.sumOfProperties());
        } else {
            System.out.printf("\n%s(%d) лучший студент , чем %s(%d)",
                    hg2.getName(), hg2.sumOfProperties(), hg1.getName(), hg1.sumOfProperties());
        }
    }



}
