package Polimorpism;
abstract class dog{
	String breed;
	public void bark() {
		System.out.println("bark!");
	}
	public abstract void poop();
}
class cat extends dog{
	public void poop() {
		System.out.println("dog pooped");
	}
	
}
public class abstraction_basic {
	public static void main (String[] args) {
		//dog d=new dog();//cause its a abstract class
		cat c=new cat();
		c.bark();
		c.poop();
		
	}

}
