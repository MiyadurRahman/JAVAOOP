package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class spring2024 {
    static int minvalue=Integer.MAX_VALUE;
    public static void main(String[] args)  {
       try {
           File f = new File("writefile.txt");

           Scanner reader = new Scanner(f);
           while (reader.hasNextLine()) {
               String str = reader.nextLine().trim();
               try{
                   int num=Integer.parseInt(str);
                   if(num<minvalue){
                       minvalue=num;

                   }

               }catch(NumberFormatException e){

                   System.out.println("skip");

               }
               reader.close();
           }
           FileWriter fw=new FileWriter("output.txt");
          if(minvalue !=0 ){
              fw.write("minimum value :"+minvalue);
              System.out.println("minimum value :"+minvalue);
          }
          fw.close();
       }catch (FileNotFoundException e) {
           System.out.println("file not found");
           e.printStackTrace();

       }catch(IOException e){
           System.out.println("error writing to file");
           e.printStackTrace();
       }

    }
}
