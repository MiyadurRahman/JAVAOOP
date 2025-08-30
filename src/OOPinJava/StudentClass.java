package OOPinJava;
import java.util.Scanner;

public class StudentClass {

    public static class Car{

        String name;
        String type;
        int price;
       private int year;//we cannot access from other blocks
    }
    public static void fun(Student x){
        x.name="rifat";
        System.out.println(x.name);
        return;
    }
    public static void main(String[] args) {
//        Car c1= new Car();
//        c1.name="alto";
//        c1.price=400000;
//        c1.type=" hatchback";

//        Scanner sc =new Scanner(System.in);
//        int x = sc.nextInt();
//        Student x = new Student();
//        x.name="rifat";

//        System.out.println(x.name);
        Student x=new Student("miyad",44,55.00);
        Student y=new Student("ratul",42,56.00);
        Student z=new Student("rifat",43,57.00);
//        System.out.println(y.schoolname);
//        System.out.println(y.rno);
        System.out.println(x.noofstudents);

//        x.name="miyadur";
//        x.rno=76;
//        x.percent=92.75;
//         fun(x);
//        Student y = new Student();
//        y.name="rifat";
//        x.setyear(2025);
//        System.out.println(x.getyear());



    }
}
