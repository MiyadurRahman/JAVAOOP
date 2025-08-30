package Inheritance;

public class mouse1 extends mouse{
    String texture="matte";
    public static void setcolor(String color){
        System.out.println(color);

    }

    public static void main(String[] args) {
        mouse1 m =new mouse1();
        m.leftclick();
        m.rightclick();
        m.scrolldown();
        m.scrollup();
        m.setcolor("red");
    }
}
