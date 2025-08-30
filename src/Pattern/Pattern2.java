package Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pattern2{
    public static class pattern {

        int row = 4;
        int col = 5;

    }
    public static void main(String[] args) {
        pattern p = new pattern();
        for(int i=0;i<p.row;i++){
            for(int j=0;j<p.col;j++){

              if(i==0 || j==0|| i==p.row-1||j==p.col-1 ){

                  System.out.print("*");

              }else{

                  System.out.print(" ");

              }


            }
            System.out.println();

        }


    }

}