package lesson2;

public class Main {

    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри", "Поттер");
        Gryffindor hermyona = new Gryffindor("Гермиона", "Грейнджер");
        Gryffindor ron = new Gryffindor("Рон", "Уизли");

        Slytherin drako = new Slytherin("Драко", "Малфой");
        Slytherin graham = new Slytherin("Грэхэм", "Монтегрю");
        Slytherin gregory = new Slytherin("Грегори", "Гойл");

        Hufflepuff zacharias = new Hufflepuff("Захария", "Смит");
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори");
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли");

        Ravenclaw cho = new Ravenclaw("Чжоу", "Чанг");
        Ravenclaw padme = new Ravenclaw("Падма", "Патил");
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби");

        Hogwarts hgw = new Hogwarts();

        drako.printInfo();
        ron.printInfo();

        hgw.studEquals(harry, hermyona);
        hgw.studEquals(drako, ron);
    }

}
