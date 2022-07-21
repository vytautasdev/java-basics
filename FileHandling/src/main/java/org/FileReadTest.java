package org;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

    public static void main(String[] args) {
        try {
            var fr = new FileReader("x.txt");//to read the file
            var data = fr.read();//perform  read on file , it reads ascii value of the characters
            while (data != -1)//run loop while it is not end of file
            {
                System.out.print((char) data);//change ascii value of characters to character
                data = fr.read();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
