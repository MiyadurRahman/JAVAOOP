package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        try{
            File f =new File("writefile.txt");
            Scanner reader= new Scanner(f);
            while(reader.hasNextLine()){
                String data=reader.nextLine();
                System.out.println(data);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();

        }
    }
}
