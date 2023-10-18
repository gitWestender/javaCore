package lesson7.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void printOddList(List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                tmp.add(list.get(i));
            }
        }

        System.out.println(tmp.toString());
    }
}
