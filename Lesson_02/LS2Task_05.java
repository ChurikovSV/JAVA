// Задание №5
// 📌 Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LS2Task_05 {
    private static Logger logger = Logger.getLogger(LS2Task_05.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileH = new FileHandler("log.txt");
            logger.addHandler(fileH);
            SimpleFormatter Form = new SimpleFormatter();
            fileH.setFormatter(Form);
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String[] folder = getFolderContent(".");
        writeTextFile(folder, "file2.txt");

    }

    public static String[] getFolderContent(String nameFolder) {
        File folder = new File(nameFolder);
        return folder.list();
    }

    public static void writeTextFile(String[] str, String name) {
        try (FileWriter fw = new FileWriter(name)) {
            for (String el : str) {
                fw.write(el);
                fw.write(System.lineSeparator());
                writeLogFile("Ac", "log.txt");
            }
        } catch (IOException e) {
            e.printStackTrace();
            writeLogFile("Err", "log.txt");
        }
    }

    public static void writeLogFile(String msg, String nameLog) {
        try (FileWriter fw = new FileWriter(nameLog)) {
            fw.write(msg);
            fw.write(LocalDateTime.now().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
