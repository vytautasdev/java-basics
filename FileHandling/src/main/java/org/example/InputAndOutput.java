package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutput {

    public void copy(String inFile, String outFile) throws IOException {
        var fileInputStream = new FileInputStream("x.txt");
        var fileOutputStream = new FileOutputStream("y.txt");
        int numberOfBytesRead = 0;
        var byteArray = new byte[128];
        while (numberOfBytesRead == fileInputStream.read(byteArray)) {
            fileOutputStream.write(byteArray, 0, numberOfBytesRead);
        }


    }
}
