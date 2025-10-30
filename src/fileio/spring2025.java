package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class spring2025 {
    public static void main(String[] args) {
        int sum;

        try {
            File f = new File("src/student.txt");
            Scanner reader = new Scanner(f);

            // Create FileWriters outside the loop so they stay open while writing
            FileWriter fw = new FileWriter("src/info.txt");
            FileWriter fw1 = new FileWriter("src/mark.txt");

            // Read line by line
            while (reader.hasNextLine()) {
                try {
                    String line = reader.nextLine();
                    String[] arr = line.split(" "); // split by spaces

                    String id = arr[0];
                    String name = arr[1];
                    int mark1 = Integer.parseInt(arr[2]);
                    int mark2 = Integer.parseInt(arr[3]);
                    sum = mark1 + mark2;

                    // Write to info.txt (ID and Name)
                    fw.write(id + " " + name + "\n");

                    // Write to mark.txt (Name and Sum)
                    fw1.write(name + " " + sum + "\n");

                } catch (NumberFormatException e) {
                    System.out.println("Number format error in line.");
                }
            }

            // Close all files after the loop
            reader.close();
            fw.close();
            fw1.close();

            System.out.println("Files created successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("student.txt file not found!");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("I/O error occurred!");
            e.printStackTrace();
        }
    }
}
