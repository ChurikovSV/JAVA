// Задание №4
// 📌 Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LS3Task_04 {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>(3);
        ArrayList<String> gencel1 = new ArrayList<>(Arrays.asList("Детектив", "Книга1", "Книга2"));
        ArrayList<String> gencel2 = new ArrayList<>(Arrays.asList("Проза", "Книга1", "Книга2"));
        catalog.add(gencel1);
        catalog.add(gencel2);
        for (ArrayList<String> gencel : catalog) {
            System.out.println(gencel);
        }

    }
}
