package org.example.controller;

import org.example.model.CreateArrayFromFile;
import org.example.model.MapOfRepeatedWord;
import org.example.service.CounterArray;
import org.example.service.WorkWithFile;

import java.io.IOException;

public class Controller {
    public void start() throws IOException {
        WorkWithFile workWithFile = new WorkWithFile();
        String line = workWithFile.readFile();
        if (line.equals("-1")) {
            System.out.println("Записи отсутсвуют! Дальнейшее выполнение невозможно!");
        } else {
            CreateArrayFromFile createArrayFromFile = new CreateArrayFromFile();
            String[] strArray = createArrayFromFile.createArray(line, " ");
            CounterArray counterArray = new CounterArray(strArray);
            System.out.println(counterArray.toString());
            MapOfRepeatedWord mapOfRepeatedWord = new MapOfRepeatedWord(strArray);
            System.out.println(mapOfRepeatedWord.toString());

        }

//        CreateArrayFromFile createArrayFromFile = new CreateArrayFromFile();
//        //inputArrayString.createArray(line);
    }
}
