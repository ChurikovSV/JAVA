// Задание №3
// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022
// 'I', 1
// 'V', 5
// 'X', 10
// 'L', 50
// 'C', 100
// 'D', 500
// 'M', 1000

package Lesson_05;

import java.util.Map;
import java.util.HashMap;

public class LS5Task_04 {
    public static void main(String[] args) {
        String roman = "MMXXII";
        System.out.println("Римское число - " + roman);
        parseRomNum(roman);
        System.out.println(parseRomNum(roman));

    }

    public static Map<Character, Integer> mapData() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public static int parseRomNum(String roman) {
        Map<Character, Integer> map = mapData();

        int result = 0;
        int temp = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int number = map.get(roman.charAt(i));
            if (number < temp) {
                result -= number;
            } else {
                result += number;
            }
            temp = number;
        }
        return result;
    }

}