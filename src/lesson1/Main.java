package lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        //В данном случае, переменная параметра метода (в данном случае прим.типа int)
        //ей присваиваеться значение переменной созданной вне метода
        //затем ей присваиваеться значение 22.
        //т.к мы изменяли только переменную-параметр метода, то после завершения метода
        //переменная, значение которой передавали в параметр метода, останеться неизменной
        System.out.println(value);

        Integer value1 = 33;
        //В данном случае, переменная параметра метода (в данном случае объект класса Integer)
        //ссылаеться на переменную созданую вне метода.
        //ссылка на value равна ссылке на value1
        //дальше мы вносим изменения, заменяя значение value на 22, но т.к мы
        //не изменяли value1 , его значение останеться неизменным по окончании метода
        changeValue(value1);
        System.out.println(value1);

        Integer[] value7 = new Integer[] {1,2};
        //В данном случае, переменная параметра метода (массив объектов класса Integer)
        //т.к массив - это объект, то его переменная только саму ссылку
        //переменной параметра метода присваиваеться ссылка на созданный нами массив
        //затем, этой же переменной параметра метода присваиваеться ссылка на новый массив
        //т.к мы не производили с нашим массивом никаких действий он останеться неизменным после окончания метода
        changeValue(value7);
        System.out.println(Arrays.toString(value7));

        Integer[] value8 = new Integer[] {3,4};
        //от предыдущей задачи, эта отличаеться тем, что после присваивания параметру метода ссылки на наш массив
        //мы начали изменять его по этой ссылке.
        //А т.к на массив ссылаеться 2 переменной, то изменения произведенные одной из них
        //будут видны и другой
        //По окончании метода будем иметь массив со значениями [99, 4]
        changeValue(value8);
        System.out.println(Arrays.toString(value8));

        Person person = new Person("Lyapis", "Trubetskoy");
        //Задание 9
        //Объяснение алналогично 2ому заданию, ведь там тоже используеться объект класса(только другого)
        //Имя и фамилия не изменяться
        //Задание 10
        //Т.к переменной параметру метода присваиваеться ссылка на объект,
        //то изменения объекта, при которых используеться эта ссылка,
        //будут видны и переменной, чью ссылку мы передали
        //Имя и фамилия изменяться
        changePerson(person);
        System.out.println(person.toString());
    }

    static void changeValue(int value) {
        value = 22;
    }

    static void changeValue(Integer value) {
        value = 22;
    }

    static void changeValue(Integer[] value) {
        //value = new Integer[] {3, 4};
        value[0] = 99;
    }

    public static void changePerson(Person person) {
        //person = new Person("Ilya", "Lagutenko");
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}
