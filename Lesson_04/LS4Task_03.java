// Задание №3
// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди

package Lesson_04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LS4Task_03 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        Stack<Integer> stack = getStack(array);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();
        Queue<Integer> queue = getQueue(array);
        System.out.println(queue);

    }

    public static Stack<Integer> getStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int el : array) {
            stack.push(el);
        }
        return stack;
    }

    public static Queue<Integer> getQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (int el : array) {
            queue.add(el);
        }
        return queue;
    }
}
