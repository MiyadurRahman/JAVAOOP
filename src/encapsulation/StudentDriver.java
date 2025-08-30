package encapsulation;

//without inheritance
class Student {
  public String name;
  public int age;
  public String id;

  Student(String name, int age, String id) {
      this.name = name;
      this.age = age;
      this.id = id;
  }

  public void displayInfo() {
     System.out.println(name);
     System.out.println(age);
     System.out.print(id);
  }
}
class person extends  Student{
    private String id;

    public person(String name, int age, String id) {
        super(name, age,id);
        this.id = id;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ID: " + id);
    }
}


// driver class
class StudentDriver {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 20, "S12345");
        
        // Call displayInfo method to show student details
        student.displayInfo();
    }
}



// with inheritance


