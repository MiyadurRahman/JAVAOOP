package lecture4;
class pssbyvalue{
	static void changeNumber(int num) {
        num = 20; // This only changes the copy
        System.out.println("Inside method: " + num); // Output: 20
	
}
}
class book{
	String author;
	String title;
	double price;
	double displaydiscout(double displaypercent) {
		price=price -price*(displaypercent/100);
		return price;
	}
	void displaydetails() {
		System.out.println(author);
		System.out.println(title);
		System.out.println(price);
		
		
	}
}



public class practice {
public static void main(String[]args) {
//	book x=new book();
//	x.author="miyad";
//	x.title="sad";
//	x.price=1000;
//	x.displaydiscout(10);
//	x.displaydetails();
	pssbyvalue x=new pssbyvalue();
	 int number = 10;
	 
     System.out.println("Before: " + number); // Output: 10
     
     changeNumber(number);
     System.out.println("After: " + number);  // Output: 10 (unchanged)
     // if i 
    
    
     
	
	
}

private static void changeNumber(int number) {
	// TODO Auto-generated method stub
	
}
}
