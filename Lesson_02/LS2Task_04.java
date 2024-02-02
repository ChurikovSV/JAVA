// Задание №4
// 📌 Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения

import java.io.FileWriter;
import java.io.IOException;

public class LS2Task_04 {
    public static void main(String[] args) {
        String str = "TEST";
        int count = 100;
        String strBuil = getStrBuil(str, count);
        introTextFile(strBuil, "Text.txt");
        System.out.println(strBuil);
    }

    private static String getStrBuil(String str, int count) {
        StringBuilder strBuil = new StringBuilder();
        for (int i = 0; i < count; i++) {
            strBuil.append(str + " ");
        }
        return strBuil.toString();
    }

    public static void introTextFile(String str, String name) {
        try (FileWriter fw = new FileWriter(name)) {
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
