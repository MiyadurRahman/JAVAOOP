package Polimorpism;
class bird{
	public void sing() {
		System.out.println("tweet tweet tweet");
		
	}
	
}
class robin extends bird{
	public void sing() {
		System.out.println("ting ting ting");
		
}
}

public class polybasic {
public static void main(String[] args) {
	bird b=new bird();
	b.sing();
	robin g=new robin();//still run
	g.sing();
	
}
}
