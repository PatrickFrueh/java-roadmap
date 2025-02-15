class Animal {  
    // Method to be overridden  
    public void sound() {  
        System.out.println("Animal makes a sound");  
    }  
}  
class Dog extends Animal {  
    // Overriding method  
    @Override  
    public void sound() {  
        System.out.println("Dog barks");  
    }  

    public static void main (String args[]) {
        Dog dog = new Dog();
        dog.sound();

    }
}  