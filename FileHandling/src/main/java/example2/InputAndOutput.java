package example2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputAndOutput {
	 public void bufferedCopy() throws IOException {
	        try(
					var br = new BufferedReader(new FileReader("x.txt"));
					var bw = new BufferedWriter(new FileWriter("y.txt"))
	        ) {
				String line;
	            while((line = br.readLine()) != null) {
	                bw.write(line + "\n");
	            }
	        } catch (IOException e) {
	            System.out.println("IOException: " + e.getMessage());
	        }
	    }

}
