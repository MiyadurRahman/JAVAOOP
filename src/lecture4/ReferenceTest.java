package lecture4;
public class ReferenceTest {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before: " + person.name); // Output: Alice
        
        tryToReassign(person);
        System.out.println("After: " + person.name);  // Output: Alice (unchanged)
    }
    
    static void tryToReassign(Person p) {
        p = new Person("Bob"); // This only changes the local copy
        System.out.println("Inside: " + p.name); // Output: Bob
    }
}