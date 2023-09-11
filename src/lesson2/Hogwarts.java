package lesson2;

public class Hogwarts {
    private String name;
    private String surname;

    public Hogwarts(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return name + " " + surname + "\n"
                + "Свойства характера:\n";
    }

    public void printInfo() {
        System.out.println(toString());
    }
}
