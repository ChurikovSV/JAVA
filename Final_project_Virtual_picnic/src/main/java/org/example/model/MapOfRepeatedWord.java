package org.example.model;

import java.util.HashMap;

public class MapOfRepeatedWord {
    private HashMap <String,Integer> hashMap = new HashMap<>();

    public MapOfRepeatedWord(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            if (isExistWordInMap(strArray[i])) {
                addExistKey(strArray[i]);
            } else {
                addNewKey(strArray[i]);
            }
        }
    }


    /**
     * Проверяет есть ли такое слово в карте
     * @param string передаваемое для поиска слово в карте
     * @return если слово найдено возвращает true, если нет false
     */
    private boolean isExistWordInMap(String string) {
        if (hashMap.containsKey(string)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Метод, который добавляет новый элемент в карту
     * @param string новый ключ
     */
    private void addNewKey(String string) {
        hashMap.put(string, 1);
    }

    /**
     * Метод, который добавляет значение +1 к уже имеющемуся ключу
     * @param string
     */
    private void addExistKey(String string) {
        int temp = hashMap.get(string);
        hashMap.put(string, temp+1);
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }


    @Override
    public String toString() {
        return "Количество слов: " + hashMap + '.';
    }
}
