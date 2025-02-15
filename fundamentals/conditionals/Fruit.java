public class Fruit {

    // Instance variable (not static)
    String MyFruit;

    // Constructor to initialize MyFruit
    public Fruit(String fruit) {
        this.MyFruit = fruit;
    }

    // Instance method to display the fruit
    public void displayFruit() {
        switch (MyFruit) {
            case "Pears":
                System.out.println("I love " + MyFruit);
                break;
            case "Mango":
                System.out.println("I love " + MyFruit);
                break;
            default:
                System.out.println("I don't love this fruit.");
        }
    }

    public static void main(String args[]) {
        // Create an object of the Fruit class
        Fruit fruit1 = new Fruit("Pears");
        fruit1.displayFruit();  // Output: I love Pears

        Fruit fruit2 = new Fruit("Mango");
        fruit2.displayFruit();  // Output: I love Mango
    }
}
