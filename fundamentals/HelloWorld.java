// Define a class named HelloWorld
public class HelloWorld {
    // The main method – the entry point of a Java application
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Print output

        String name = "Peter";
        String upperName = name.toUpperCase();
        System.out.println(upperName); // Print output

        String exclaim = addExclamatationPoint("Hot Dogs");
        System.out.println(exclaim);

    }

    public static String addExclamatationPoint(String s) {
        return s + "!";
    }

}