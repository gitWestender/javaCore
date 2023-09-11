package lesson2;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname) {
        super(name, surname);
        this.mind = getRND();
        this.wisdom = getRND();
        this.witty = getRND();
        this.creative = getRND();
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

    @Override
    public String toString() {
        return super.toString() + "Ум: " + mind +
                ", Мудрость: " + wisdom +
                ", Остроумность: " + witty +
                ", Творчество:" + creative +
                '}';
    }
}
