// Задание №3
// 📌 Создать список типа ArrayList<String>.
// 📌 Поместить в него как строки, так и целые числа.
// 📌 Пройти по списку, найти и удалить целые числа

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LS3Task_03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello", "2", "world"));
        System.out.println(list);
        deleteInts(list);
        System.out.println(list);

    }

    public static void deleteInts(ArrayList<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String temp = iter.next();
            if (isNumber(temp)) {
                iter.remove();
            }
        }

    }

    public static boolean isNumber(String elem) {
        try {
            Integer.parseInt(elem);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
