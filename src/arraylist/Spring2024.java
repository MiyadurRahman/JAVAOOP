package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
String name;
int amount;
int unitPrice;
Product(String name,int amount,int unitPrice){
    this.name=name;
    this.amount=amount;
    this.unitPrice=unitPrice;
}
void display(){
    System.out.println(name+" "+amount+" "+unitPrice);

}
int totalprice(){
    return (int) (amount*unitPrice);
}

}
public class Spring2024 {
    public static void main(String[] args) {
        ArrayList<Product> list=new ArrayList<Product>();
        list.add(new Product("mango",5,20));
        list.add(new Product("apple",4,24));
        list.add(new Product("litchi",20,3));
        list.set(1,new Product("banana",10,12));
        Collections.sort(list,new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                return o2.totalprice()-o1.totalprice();
            }
        });
        for(Product x: list){
            if(x.name.equals("apple")){
                x.unitPrice=30;
            }
        }
        for(Product x: list){
            x.display();
        }

    }
}
