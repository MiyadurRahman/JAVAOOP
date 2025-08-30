package Inheritance;
class vehicle{

    int speed=100;
    String color="orange";
    String sound="vroom_vroom";
    vehicle(){
        speed=500;
        System.out.println("vehicle constructor");

    }
    public  void print(){

        System.out.println(speed + " " + color + " " + sound);

    }

}
class car extends vehicle{
 int price=100000000;
 int speed = 200;//it will override the varible
 car(){
     super();
     super.color=color;
     super.speed=speed;
     super.speed=300;
     System.out.println("car constructor");
     System.out.println(color );
     System.out.println(speed);

 }
    public void print(){//this method is overrided
        super.print();
        //it will print the vehicles method cause of super keyword;
        System.out.println(super.speed + " " + color + " " + sound +" "+price);//if we use super befor variable,method,constructer it will print the vehicles data

    }

}

public class Vroom {
    public static void main(String[] args) {
        car c =new car();
//        c.print();
//        vehicle v =new vehicle();
//
//        v.print();
    }
}
