// Задание №0
// 📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

package Lesson_04;

import java.util.ArrayList;
import java.util.LinkedList;

public class LS4Task_01 {
    public static void main(String[] args) {
        int count = 100_000;

        System.out.println("Добавление элементов в конец ");
        long start = System.currentTimeMillis();
        addEl(count);
        System.out.println("addEl " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        addElLin(count);
        System.out.println("addElLin " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        addElMidl(count);
        System.out.println("addElMidl " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        addElLinMidl(count);
        System.out.println("addElLinMidl " + (System.currentTimeMillis() - start));

    }

    public static ArrayList<Integer> addEl(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> addElLin(int count) {
        LinkedList<Integer> arrayLinkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            arrayLinkedList.addFirst(i);
        }
        return arrayLinkedList;
    }

    public static ArrayList<Integer> addElMidl(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> addElLinMidl(int count) {
        LinkedList<Integer> arrayLinkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            arrayLinkedList.add(arrayLinkedList.size() / 2, i);
        }
        return arrayLinkedList;
    }

}
