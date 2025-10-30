package threads;
class additionodd extends Thread{

    int result=0;

    @Override
    public void run() {
        for(int i=1;i<=50;i=i+2){
           result +=i;

        }
    }

}
class subtractioneven extends Thread{
    int result=0;
    public void run(){

        for(int i=2;i<=50;i=i+2){
            result-=i;
        }
    }
}
public class Summer2024 {
    public static void main(String[] args) {
        additionodd m=new additionodd();
        subtractioneven m1=new subtractioneven();
        m.start();
        m1.start();
        try{
            m.join();
            m1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        int result=m.result+m1.result;
        System.out.println(result);
    }
}
