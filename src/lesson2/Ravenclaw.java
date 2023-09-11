package lesson2;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname, int mind, int wisdom, int witty, int creative) {
        super(name, surname);
        this.mind = mind;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
