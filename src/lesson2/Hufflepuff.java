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
    }

    public int getHardWorker() {
        return hardWorker;
    }

    public void setHardWorker(int hardWorker) {
        this.hardWorker = hardWorker;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Трудолюбие: " + hardWorker +
                ", Верность: " + loyalty +
                ", Честность: " + honesty;
    }
}
