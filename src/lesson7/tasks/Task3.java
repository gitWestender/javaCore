package lesson7.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    public static void printUniqStrings(List<String> list) {
        Set<String> setOfStrings = new HashSet<>();

        for (String string : list) {
            setOfStrings.add(string);
        }

        System.out.println(setOfStrings.toString());
    }
}
