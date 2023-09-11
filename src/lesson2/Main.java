package lesson2;

import java.util.Random;

public class Main {
    static Random rnd = new Random();

    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри", "Поттер", getRND(), getRND(), getRND(), getRND(), getRND());
        Gryffindor hermyona = new Gryffindor("гермиона", "Грейнджер", getRND(), getRND(), getRND(), getRND(), getRND());
        Gryffindor ron = new Gryffindor("Рон", "Уизли", getRND(), getRND(), getRND(), getRND(), getRND());

        Slytherin drako = new Slytherin("Драко", "Малфой", getRND(), getRND(), getRND(), getRND(), getRND(), getRND(), getRND());
        Slytherin graham = new Slytherin("Грэхэм", "Монтегрю", getRND(), getRND(), getRND(), getRND(), getRND(), getRND(), getRND());
        Slytherin gregory = new Slytherin("Грегори", "Гойл", getRND(), getRND(), getRND(), getRND(), getRND(), getRND(), getRND());

        Hufflepuff zacharias = new Hufflepuff("Захария", "Смит", getRND(), getRND(), getRND(), getRND(), getRND());
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", getRND(), getRND(), getRND(), getRND(), getRND());
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", getRND(), getRND(), getRND(), getRND(), getRND());

        Ravenclaw cho = new Ravenclaw("Чжоу", "Чанг", getRND(), getRND(), getRND(), getRND(), getRND(), getRND());
        Ravenclaw padme = new Ravenclaw("Падма", "Патил", getRND(), getRND(), getRND(), getRND(), getRND(), getRND());
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", getRND(), getRND(), getRND(), getRND(), getRND(), getRND());

    }

    public static int getRND() {
        return rnd.nextInt(101);
    }

}
