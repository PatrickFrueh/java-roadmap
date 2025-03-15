import java.lang.reflect.Array;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] multiArray = new int[10][20];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                multiArray[i][j] = i * j;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println(multiArray[i][j]);
            }
        }
        
    }
}