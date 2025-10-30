package threads;
class user extends Thread{
    movietheater m;

    int Numoftickets;
    user(movietheater m,int Numoftickets,String name){
        super(name);
        this.m=m;
        this.Numoftickets=Numoftickets;
    }
    public void run(int numoftickets){


    }

}
 class movietheater {
    int availableSeats;
    movietheater(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public synchronized int bookTickiets(int numOfseats) {
       int NumofticketsBooked=0;
        for(int i=0;i<numOfseats;i++){
            if(availableSeats>0){
                availableSeats--;
                NumofticketsBooked++;
            }
        }
        return NumofticketsBooked;

     }
}
class  MOVIE{
    public static void main(String[] args) {
        movietheater m=new movietheater(15);
    }

}
