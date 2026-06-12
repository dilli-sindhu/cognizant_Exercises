/*
. File Reading 
• Objective: Read data from a file. 
• Task: Read and display the contents of output.txt. 
• Instructions: 
o Open output.txt for reading. 
o Read each line and display it on the console. 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}