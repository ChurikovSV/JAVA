package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class Controller {
    public static void start() {
        Toy_Store toyStore = new Toy_Store();
        PriorityQueue<Toy> toys = toyStore.getToysQueue();

        // Добавляю игрушки в очередь
        toyStore.addToy(toyStore.toysQueue, "1 2 щенок");
        toyStore.addToy(toyStore.toysQueue, "2 2 котенок");
        toyStore.addToy(toyStore.toysQueue, "3 6 набор кухни");


        // Вызываем метод Get 10 раз и записываем результат в файл
        try {
            FileWriter writer = new FileWriter("output.txt");
            for (int i = 0; i < 10; i++) {
                int toyId = toyStore.getToy(toys);
                writer.write(Integer.toString(toyId) + "\n");
            }
            writer.close();
            System.out.println("Результаты вы можете посмотреть в файле output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
