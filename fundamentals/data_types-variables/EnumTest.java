// Enum definition (must go before any class that uses it)
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Main class
public class EnumTest {
    Day day;

    // Constructor
    public EnumTest(Day day) {
        this.day = day;
    }

    // Method to print messages based on the day
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        EnumTest test1 = new EnumTest(Day.MONDAY);
        test1.tellItLikeItIs(); // Output: Mondays are bad.

        EnumTest test2 = new EnumTest(Day.SATURDAY);
        test2.tellItLikeItIs(); // Output: Weekends are best.
    }
}
