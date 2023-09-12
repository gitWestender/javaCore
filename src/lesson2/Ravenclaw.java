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

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    public String toString() {
        return super.toString() + "Ум: " + mind +
                ", Мудрость: " + wisdom +
                ", Остроумность: " + witty +
                ", Творчество:" + creative +
                '}';
    }

    @Override
    public int sumOfProperties() {
        return getCreative() + getMind() + getWisdom() + getWitty();
    }
}
