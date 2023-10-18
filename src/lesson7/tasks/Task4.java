package lesson7.tasks;

import java.util.*;

public class Task4 {

    public static void printNumsOfDoubles(List<String> list) {
        Map<String, Integer> mapOfDoubles = new HashMap<>();
        Integer defaultValue = 1;

        for (int i = 0; i < list.size(); i++) {
            if (mapOfDoubles.containsKey(list.get(i))) {
                mapOfDoubles.put(list.get(i), mapOfDoubles.get(list.get(i)) + 1);
            } else {
                mapOfDoubles.put(list.get(i), defaultValue);
            }
        }

        System.out.println(mapOfDoubles.toString());
    }
}
