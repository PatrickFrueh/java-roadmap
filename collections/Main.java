public class Main {

    public static void main(String[] args) {
        // int[] intArray = new int[10];
        // int arrayLength = intArray.length;
        // System.out.println(arrayLength);

        // Create array of length 10
        String[] stringArray = new String[10];

            // Set the value at index "i" to the number of current index
            for(int i=0; i < stringArray.length; i++) {
                stringArray[i] = "String no " + i;
            }

            // Print each index of created array
            for(int i=0; i < stringArray.length; i++) {
                System.out.println( stringArray[i] );
}


    }
}