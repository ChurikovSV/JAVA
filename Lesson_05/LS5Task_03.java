package Lesson_05;

/* Задание №2
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь*/

import java.util.Map;
import java.util.Stack;
import java.util.HashMap;

public class LS5Task_03 {
    public static void main(String[] args) {
        String[] strs = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" };
        for (String str : strs) {
            boolean check = checkBr(str);
            System.out.println(str + " -> " + check);
        }
    }

    public static Map<Character, Character> mapBr() {
        Map<Character, Character> map = new HashMap<>();
        map.put('>', '<');
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        return map;
    }

    public static boolean checkBr(String str) {
        Map<Character, Character> map = mapBr();
        Stack<Character> stack = new Stack<>();
        for (char value : str.toCharArray()) {
            if (map.containsValue(value)) {
                stack.push(value);
            } else if (map.containsKey(value)) {
                if (stack.isEmpty() || stack.pop() != map.get(value)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

}
