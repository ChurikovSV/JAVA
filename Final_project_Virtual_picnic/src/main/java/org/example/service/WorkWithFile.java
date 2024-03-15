package org.example.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WorkWithFile {
    public String readFile() throws IOException {
        if (isHaveText()) {
            File file = new File("input.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            reader.close();
            return line;
        } else {
            System.out.println("вернулся null");
            String str = "-1";
            return str;

        }
    }

    private boolean isHaveText() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line = reader.readLine();
            reader.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}

