package practice;
class VideoGame{
	int id;
	String title;
	String platform;
	double price ;
	VideoGame(int id, String title,String platform,double price){
		this.title=title;
		this.platform=platform;
		this.price=price;
		
	}
	
}
class ShoppingCart{
	VideoGame[]games;
	int countgames;
	
	ShoppingCart(int maxcount){
		this.games=new VideoGame[maxcount];
		this.countgames=0;
		}
   void addgame(VideoGame newgame) {
	   if(countgames<=games.length) {
		   System.out.println("cart is full");
		   
		   
	   }
	   else {
		   games[countgames]=newgame;
		   countgames++;
		   
		   
	   }
   }
   double gettotalprice() {
	   double totalprice=0;
	   for(VideoGame x:games) {
		   
		   totalprice+=x.price;
	   }
	   return totalprice;
	   
	   
   }
   double gataverage() {
	   double totalprice =gettotalprice();
	   return(totalprice/games.length);
	   
	   
   }
   VideoGame[] getgamesbelowprice(double said_price) {
	   VideoGame[] belowGames =new VideoGame[games.length];
	   int count=0;
	   for(VideoGame x: games) {
		   
		   if(x.price<said_price) {
			   
			   belowGames[count]=x;
			   count++;
		   }
	   }
	   return belowGames;
	   
   }
	
}

public class practice_ct1 {
public static void main(String[] args) {
	  VideoGame v1 = new VideoGame(101,"A","PS1", 100);
      VideoGame v2 = new VideoGame(102,"B","PS2", 150);
      VideoGame v3 = new VideoGame(103,"C","PS3", 50);
      VideoGame v4 = new VideoGame(104,"D","PS4", 200);
      VideoGame v5 = new VideoGame(105,"E","PS5", 250);
	
	ShoppingCart cart = new ShoppingCart(5);

        cart.addgame(v1);
        cart.addgame(v2);
        cart.addgame(v3);
        cart.addgame(v4);
        cart.addgame(v5);
	
}
}
