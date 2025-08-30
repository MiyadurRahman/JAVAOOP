package lecture4;

class calculator {
    // Public method - accessible from anywhere
    public int add(int a, int b) {
        return a + b;
    }
    
    // Protected method - accessible within package and subclasses
    protected int subtract(int a, int b) {
        return a - b;
    }
    
    // Default (package-private) method - accessible only within package
    int multiply(int a, int b) {
        return a * b;
    }
    
    // Private method - accessible only within this class
    private int divide(int a, int b) {
        if (b != 0) return a / b;
        return 0;
    }
    
    // Additional method to test private access within same class
    public int testPrivateDivide(int a, int b) {
        return divide(a, b); // This works - same class
    }
    
}
public class calcu {
    public static void main(String[] args) {
        calculator calc = new calculator();
        
        // 1. Public method - WILL COMPILE
        int sum = calc.add(5, 3);
        System.out.println("Addition: " + sum);
        
        // 2. Protected method - WILL COMPILE
        // Same package, so protected is accessible
        int difference = calc.subtract(5, 3);
        System.out.println("Subtraction: " + difference);
        
        // 3. Default (package-private) method - WILL COMPILE
        // Same package, so default is accessible
        int product = calc.multiply(5, 3);
        System.out.println("Multiplication: " + product);
        
        // 4. Private method - WILL NOT COMPILE
        // Error: divide(int, int) has private access in Calculator
        // int quotient = calc.divide(6, 3);
        
        // Alternative: Use public method that calls private method
        int quotient = calc.testPrivateDivide(6, 3);
        System.out.println("Division: " + quotient);
    }
}