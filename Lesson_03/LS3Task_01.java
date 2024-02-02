// Задание №1
// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LS3Task_01 {
    public static List<Integer> createList(int size, int maxValue) {
        List<Integer> list = new ArrayList<>(size);
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(maxValue));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = createList(10, 100);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}