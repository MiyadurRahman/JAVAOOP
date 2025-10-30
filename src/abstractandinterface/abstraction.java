package abstractandinterface;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

interface Swimmable {
    void swim();
}

class Duck extends Animal implements Swimmable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Quack!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming in the pond.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Duck duck = new Duck("Donald");
        duck.makeSound(); // Donald says: Quack!
        duck.swim();      // Donald is swimming in the pond.
    }
}
