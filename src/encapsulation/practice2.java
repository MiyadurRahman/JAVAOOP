package encapsulation;

class Base {
    Base() {
        System.out.print("1 ");
    }
    Base(int a) {
        System.out.print("2 ");
    }
}
class Derived extends Base {
    Derived() {
        //super(10);//output 2
        //if i donot use super keyword it will take default contructor
        System.out.print("3 ");
    }
}
public class practice2 {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}