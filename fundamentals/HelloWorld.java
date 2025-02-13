// Define a class named HelloWorld

import java.util.ArrayList;

public class HelloWorld {
    // The main method – the entry point of a Java application
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Print output

        String name = "Peter";
        String upperName = name.toUpperCase();
        System.out.println(upperName); // Print output

        String exclaim = addExclamatationPoint("Hot Dogs");
        System.out.println(exclaim);

        Animal a = new Animal();
        String dog = a.iAmDog();
        System.out.println(dog);

        // ArrayList<Integer> b = new ArrayList<Integer>();

    }

    public static String addExclamatationPoint(String s) {
        return s + "!";
    }

}