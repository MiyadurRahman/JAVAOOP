package fileio;
import java.io.File;
import java.io.IOException;

public class basicfile {
    public static void main(String[] args) {
        try{
            File f=new File("myfile.txt");
            if(f.createNewFile()){
                System.out.println("File created"+f.getName());


            }

        }
         catch (IOException e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}
