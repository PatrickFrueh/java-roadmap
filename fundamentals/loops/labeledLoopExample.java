public class labeledLoopExample {
    public static void main(String[] args) {
        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 2) {
                    break outerLoop;  // Exits the outer loop
                }
            }
        }
        System.out.println("Exited outer loop");
    }
}