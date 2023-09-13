package lesson2;

public class Hufflepuff extends Hogwarts {

    private int hardWorker;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname) {
        super(name, surname);
        this.hardWorker = getRND();
        this.loyalty = getRND();
        this.honesty = getRND();
        this.faculty = "Пуффендуй";
    }

    public int getHardWorker() {
        return hardWorker;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Трудолюбие: " + hardWorker +
                ", Верность: " + loyalty +
                ", Честность: " + honesty;
    }

    public int getSumOfPersonalProperties() {
        return getHardWorker() + getHonesty() + getLoyalty();
    }
}
