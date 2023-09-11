package lesson2;

public class Hufflepuff extends Hogwarts {
    private int hardWorker;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int hardWorker, int loyalty, int honesty) {
        super(name, surname);
        this.hardWorker = hardWorker;
        this.loyalty = loyalty;
        this.honesty = honesty;
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
}
