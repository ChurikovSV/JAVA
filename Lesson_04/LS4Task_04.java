// Задание №4
// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

package Lesson_04;

public class LS4Task_04 {
    static int[] array;
    static int capacity;
    static int topIndex;

    public static void main(String[] args) {
        capacity = 5;
        array = new int[capacity];
        topIndex = -1;

        System.out.println(size());
        System.out.println(empty());
        push(6);
        push(8);
        push(22);
        System.out.println(peek());
        System.out.println(size());
    }

    public static int size() {
        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int num) {
        array[++topIndex] = num;

    }

    public static int peek() {
        return array[topIndex];
    }

    public static int pap(String[] args) {
        return array[topIndex];
    }
}
