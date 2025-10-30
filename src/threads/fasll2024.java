package threads;
class positivepart extends Thread{
    double x;
    double result=0;
    positivepart(double x){
        this.x=x;
    }
    public void run() {
        for (int i = 2; i<49; i+=2){
            result+=Math.pow(x,i)/i+1;


        }
    }



}
class negativepart extends Thread{
    double x;
    negativepart(double x){
        this.x=x;
    }
    double result=0;
    public void run() {

        for (int i = 1; i<49; i+=2){
            result-=Math.pow(x,i)/i+1;
        }
    }
}
public class fasll2024 {
    public static void main(String[] args) {
        positivepart p=new positivepart(1.15);
        negativepart n=new negativepart(1.15);
        p.start();
        n.start();
        try{

            p.join();
            n.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        double finalresult=1+p.result+n.result;
        System.out.println(finalresult);
    }
}
