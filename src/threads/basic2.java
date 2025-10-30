package threads;

// Thread class implementation
class ThreadImpl extends Thread{

    @Override
    public void run(){

        // Output: Thread Class Running
        System.out.println("Thread Class Running");
    }
}

// Runnable interface implementation
class RunnableThread implements Runnable{

    @Override
    public void run(){

        // Output: Runnable Thread Running
        System.out.println("Runnable Thread Running");
    }
}

public class basic2{

    public static void main(String[] args){

        // Create and start Thread class thread
        ThreadImpl t1 = new ThreadImpl();
        t1.start();

        // Create and start Runnable interface thread
        RunnableThread r = new RunnableThread();
        Thread t2 = new Thread(r);
        t2.start();

        // Wait for both threads to complete
        //If you don’t use join(), the main thread will keep running and may finish before t1 and t2.
        //That could cause your program to end before both threads print their messages.
//      //ex:Thread Class Running
         //(main thread finished)
           //Runnable Thread Running
        try {
            t1.join(); // Wait for t1
            t2.join(); // Wait for t2
        } catch (InterruptedException e) {
            e.printStackTrace();//join() can throw an InterruptedException.
            // That happens if another thread interrupts the waiting main thread.
        }
    }
}