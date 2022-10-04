import java.util.Random;

public class BubbleSort

    public static int[] printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void createRandomArray(int arrayLength) {
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i ++) {
            array[i] = random.nextInt(bound:100);
        }
        return array;
    }
    public static void main(String[] args) throws Exception {
        int arrayLength = 5;
        int[] array = createRandomArray(arrayLength);
        printArray(array);
}  
    

