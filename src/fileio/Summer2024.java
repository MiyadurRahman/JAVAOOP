package fileio;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Summer2024 {
    public static void main(String[] args) {int sum=0;
double avg = 0;
    try{
        File f=new File("writefile.txt");
        Scanner reader=new Scanner(f);

            while(reader.hasNextLine()) {
                String str = reader.nextLine();
                try {
                    int num = Integer.parseInt(str);
                    sum=sum+num;

                }catch(NumberFormatException e) {
                    System.out.println("skip");
                }
            }
            avg=sum/9;


    }catch(FileNotFoundException e) {
        System.out.println("file not found");
        e.printStackTrace();
    }catch(IOException e) {
        System.out.println("IO Error");
        e.printStackTrace();
    }
    finally {
        System.out.println(avg);
    }




    }
}
