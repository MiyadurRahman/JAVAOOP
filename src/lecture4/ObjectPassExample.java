package lecture4;

class Person {
    String name;
    
    Person(String name) {
        this.name = name;
    }
}

public class ObjectPassExample {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before: " + person.name); // Output: Alice
        
        changeName(person);
        System.out.println("After: " + person.name);  // Output: Bob
    }
    
    static void changeName(Person p) {
        p.name = "Bob"; // This changes the actual object's state
    }
}
