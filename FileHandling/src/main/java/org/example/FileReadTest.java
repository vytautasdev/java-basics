package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("x.txt");
            var br = new BufferedReader(fr);
            var data = br.read();
            while (data != -1) {
                System.out.print((char)(data));
                data = br.read();
            }
            System.out.println(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
