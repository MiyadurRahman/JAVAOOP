package Inheritance;
class Shoe{
    public final String brand;
   public final double size_shoe;
    Shoe(String brand,double size_shoe){
        this.brand=brand;
        this.size_shoe=size_shoe;
    }



}
class Walking extends Shoe{

    public final boolean goreTex;
    Walking(boolean goreTex ,String brand,double size_shoe){
//        this.brand=brand;
//        this.size_shoe=size_shoe;
        super(brand,size_shoe);
        this.goreTex=goreTex;
    }
}
class Running extends Shoe{

  public final  double weight;
  Running(String brand,double weight,double size_shoe){
      super(brand,size_shoe);
      this.weight=weight;
  }
    }

public class Track_Pairs_OF_Shoe {
    public static void main(String[] args) {
        Shoe s =new Shoe("NIke",10);
        System.out.println(s.brand);

    }
}
