// Defining an interface
interface Animal {
    // Abstract method (does not have a body)
    void sound();
    
    // Abstract method (does not have a body)
    void sleep();
}

// Implementing the interface in a class
class Dog implements Animal {
    // Providing the implementation of sound method
    public void sound() {
        System.out.println("The dog barks");
    }
    
    // Providing the implementation of sleep method
    public void sleep() {
        System.out.println("The dog sleeps");
    }
}

// Implementing the interface in another class
class Cat implements Animal {
    // Providing the implementation of sound method
    public void sound() {
        System.out.println("The cat meows");
    }
    
    // Providing the implementation of sleep method
    public void sleep() {
        System.out.println("The cat sleeps");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Calling methods
        dog.sound();
        dog.sleep();
        
        cat.sound();
        cat.sleep();
    }
}
