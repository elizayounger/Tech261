package com.sparta.ey;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader
                    ("src/main/resources/employees-corrupted(in).csv"));

            ArrayList<String> headers = new ArrayList<>();
            ArrayList<String> bufferedFile = new ArrayList<>();
            String line;

            if ((line = bufferedReader.readLine()) != null) {
                headers.add(line);
            }
            while ((line = bufferedReader.readLine()) != null) {
                bufferedFile.add(line);
            }

            for (String printLine: bufferedFile) {
                System.out.println(printLine);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
