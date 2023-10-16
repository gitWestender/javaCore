package lesson7.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void printEvenList(List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 && !tmp.contains(list.get(i))) {
                tmp.add(list.get(i));
            }
        }

        Collections.sort(tmp);

        System.out.println(tmp.toString());
    }
}
