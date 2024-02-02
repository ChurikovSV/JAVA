// Задание №3
// 📌 Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение)

public class LS2Task_03 {
    public static void main(String[] args) {
        String str = "HeH";
        System.out.println(getRestr(str));
    }

    private static boolean getRestr(String str) {
        int strLength = str.length() - 1;
        StringBuilder restr = new StringBuilder(strLength);
        for (int i = strLength; i >= 0; i--) {
            restr.append(str.charAt(i));
        }
        return str.equals(restr.toString());
    }
}
