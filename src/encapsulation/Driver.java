package encapsulation;

//Example 4.1
class Parent {
  public int parentVariable = 10;

  public void parentMethod() {
      System.out.println("Parent Method");
  }
}

class Child extends Parent {
  public int childVariable = 5;

  public void childMethod() {
      parentMethod();
      System.out.println("In Child ParentVariable="+parentVariable+ " ,ChildVariable="+childVariable);
  }
}

//Driver Class
class Driver{
  public static void main(String args[]) {
      Child example = new Child();
      example.childMethod();
      example.parentMethod();
      System.out.println(example.parentVariable);
  }
}

