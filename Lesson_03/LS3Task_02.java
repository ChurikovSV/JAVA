// Задание №2.1
// 📌 Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// 📌 Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LS3Task_02 {
    public static List<String> createListPlanet() {
        List<String> list = new ArrayList<String>();
        list.add("Земля");
        list.add("Венера");
        list.add("Марс");
        list.add("Юпитер");
        list.add("Меркурий");
        list.add("Венера");
        list.add("Юпитер");
        list.add("Сатурн");
        list.add("Сатурн");
        list.add("Сатурн");

        return list;
    }

    public static void countRepeatPlanet(List<String> list) {
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println(sortedList);
        int count = 1;
        String temp = sortedList.get(0);
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i).equals(temp)) {
                count++;
            } else {
                System.out.println(temp + " " + count);
                count = 1;
                temp = sortedList.get(i);
            }

        }

        System.out.println(temp + " " + count);

    }

    public static void deleteRepat(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(temp)) {
                    list.remove(j);

                }
            }

        }
    }

    public static void main(String[] args) {
        List<String> list = createListPlanet();
        System.out.println(list);
        countRepeatPlanet(list);
        deleteRepat(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
