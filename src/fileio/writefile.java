package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class writefile {
    public static void main(String[] args) {
        try{
            FileWriter writer =new FileWriter ("writefile.txt");
            writer.write("files in java are good");
            writer.close();
            System.out.println("successfully writing");
        }
        catch (IOException e){
            System.out.println("error");
            e.printStackTrace();

        }
    }
}
