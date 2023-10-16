package lesson7;

import lesson7.tasks.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 10, 4, 5, 5, 6, 7));

    public static void main(String[] args) {
        Task1.printOddList(nums);
        Task2.printEvenList(nums);
    }
}
