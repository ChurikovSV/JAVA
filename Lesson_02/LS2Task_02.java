// Задание №2
// 📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd

public class LS2Task_02 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        StringBuilder res = getCompleteString(str);
        System.out.println(res);
    }

    private static StringBuilder getCompleteString(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        char temp = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == temp) {
                count++;
            } else {
                res.append(temp).append(count);
                temp = str.charAt(i);
                count = 1;
            }
        }
        res.append(temp).append(count);
        return res;
    }
}
