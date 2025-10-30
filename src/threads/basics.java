package threads;
//threads-1.extends thread class,2.implements Runnable(interface)
class Mythread extends Thread{
    //in parent class (threa) has override method so we need to override it here
   public void run(){
       System.out.println("what is you name?");


    }

}
//similarly for runnable interface
class mythread1 implements Runnable{
    public void run(){
        System.out.println("what is you name?");
    }
}

public class basics {
    public static void main(String[] args) {
        Mythread thread1 = new Mythread();
        thread1.start();//Then create an object of your class and call the start() method. This will internally call run() in a new thread.

        //if we are implementing runnable Thread then have to do it in this process
        mythread1 thread2 = new mythread1();
        Thread t1 = new Thread(thread2);
        t1.start();
        //Note: Extend Thread when when you don’t need to extend any other class. Implement Runnable when your class already extends another class (preferred in most cases).
    }
}
