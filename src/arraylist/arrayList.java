package arraylist;
import java.util.ArrayList;
import java.util.Collections;

//in array list we can only store objects
//in arrraylist what action we will do-add,get,modify,delete/remove,iterate/operation
//in array listby using object class type i can take differrent types of value of different data types
public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
      //add elment
        list.add(1);
        list.add(2);
        list.add(3);
        //get elements
        int element=  list.get(0);
        System.out.println(element);
       //add element in between
     list.add(1,1);
       System.out.println(list);
//        //set element
        list.set(0,5);
       System.out.println(list);
      //delete element
        list.remove(3);
        System.out.println(list);
        //size
        int size= list.size();
        System.out.println(size);
        //loops
        for(int i=0;i<size;i++) {
            System.out.println((list.get(i)));
        }
//        //sorting
//        Collections.sort(list);
    }
}
