class Animal {
    // Static Binding Example
    void sound() { // Base class method
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Dynamic Binding Example, here we are overriding the sound()
    // method of parent class Animal
    @Override
    void sound() { // Overridden method (Note method name is same)
        System.out.println("Dog barks");
    }
     
    // Method specific to child class Dog
    void specialBehavior() { 
        System.out.println("Dog wags tail");
    }
}

public class BindingExample {
    public static void main(String[] args) {
        // Static Binding
        Animal animal = new Animal(); // Resolved at compile-time
        animal.sound();

        // Dynamic Binding
        Animal animalDog = new Dog(); // Resolved at runtime
        animalDog.sound();

        // This will cause a compile-time error since the reference type is Animal
        // animalDog.specialBehavior(); 

        // Access Dog-specific behavior
        Dog specificDog = new Dog();
        specificDog.specialBehavior();
    }
}