package org.example.service;

public class CounterArray {
    /**
     * Длинна самого длинного слова
     */
    private int lengthLongestWord;
    /**
     * Самое длинное слово
     */
    private String longestWord;
    /**
     * Количество слов в массиве
     */
    private int countWords;

    /**
     *
     * @param strArray переданный массив для сощдания класса подсчета количества слов и самого длинного слова
     */
    public CounterArray(String[] strArray) {
        countOfWords(strArray);
        findLongestWord(strArray);
    }

    /**
     * Осуществить подсчет слов:
     * Напишите программу, которая подсчитывает количество слов в
     * файле `input.txt`.
            */
    private void countOfWords(String[] strArray) {
        countWords = strArray.length;
    }

    /**
     * Найти самое длинное слово:
     *  * Создайте программу, которая находит самое длинное слово в
     *  * файле.
     */
    private void findLongestWord(String[] strArray) {
        lengthLongestWord = strArray[0].length();
        longestWord = strArray[0];
        for (int i = 1; i < strArray.length; i++) {
            if (strArray[i].length() > longestWord.length()) {
                longestWord = strArray[i];
                lengthLongestWord = longestWord.length();
            }
        }
    }

    /**
     * Предоставляет значение длинны самого длинного слова
     * @return
     */
    public int getLengthLongestWord() {
        return lengthLongestWord;
    }

    /**
     *
     * @return возвращает самое длинное слово
     */
    public String getLongestWord() {
        return longestWord;
    }

    /**
     *
     * @return количество слов в массиве
     */
    public int getCountWords() {
        return countWords;
    }

    @Override
    public String toString() {
        return  "Длинна самого длинного слова: " + lengthLongestWord +
                ", самое длинное слово:'" + longestWord + '\'' +
                ", количество слов в файле: " + countWords + ".";
    }
}
