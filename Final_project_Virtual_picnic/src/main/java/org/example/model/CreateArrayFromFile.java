package org.example.model;

public class CreateArrayFromFile {

    /**
     * Создание массива из строки
     * @param string подающаяся строка
     * @return массив из элементов строки разделенной пробелом
     */
    public String[] createArray(String string, String delimiter) {
        if (string.isEmpty()) {
            System.out.println("массив пустой!");
            String[] strArray = new String[0];
            return strArray;
        } else {
            String[] strArray = string.split(delimiter);
            return strArray;
        }
    }


}
