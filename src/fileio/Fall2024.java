package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fall2024 {
    public static void main(String[] args) {
        String numberstring="";
        try {
            File f = new File("writefile.txt");
           Scanner reader = new Scanner(f);

           while(reader.hasNextLine()){
               String str=reader.nextLine();

                       for (int i = 0; i < str.length(); i++) {
                           char ch = str.charAt(i); // get character at position i

                           // check if it’s a digit
                           if (Character.isDigit(ch)) {
                               numberstring += ch;
                           }
                   }

           }
           reader.close();
           FileWriter fw = new FileWriter("output.txt");
 fw.write(numberstring);
 fw.close();
            System.out.println("extacted successfully");

        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("IO Error");
            e.printStackTrace();
        }
    }
}
