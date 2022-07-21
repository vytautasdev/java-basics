package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

    public static void main(String[] args) {

        FileWriter fw;

        {
            try {
                fw = new FileWriter("x.txt");
                var bw = new BufferedWriter(fw);
                var content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a feugiat quam. Duis feugiat blandit nunc, blandit ultricies erat vulputate sit amet. Etiam at nunc lacinia, egestas elit aliquet, aliquam quam. Vivamus at felis ac sem aliquet maximus id eget tellus. Phasellus ut erat vitae purus sagittis laoreet. Curabitur gravida vitae massa sit amet euismod. Morbi nec nisi sed purus ornare dapibus et vitae enim. Donec tincidunt imperdiet tristique. Vivamus sed tortor bibendum, vulputate urna sit amet, posuere urna. Aliquam suscipit leo sem, eu dapibus velit tempus eget. Proin ut augue blandit, bibendum lacus eu, vestibulum sem. Nulla facilisi. Nulla iaculis dignissim sagittis. Vestibulum lacinia sem eu blandit suscipit. Phasellus vulputate mollis ligula, sed ultrices mauris mollis pharetra.";
                bw.write(content);
                bw.flush();
                System.out.println("File written successfully!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
