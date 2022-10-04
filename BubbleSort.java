import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.temporal.Temporal;
import java.util.ArrayList;
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

    public static void writeArrayToFile(int[] array, String fileName) throws Exception {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (int a: array){
                fileWriter.write(a + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(x: "Encounter IOException");
            e.printStackTrace();
        }
    }

    public static int[] readArrayFromFile(String fileName) {
        File file = new File(fileName);
        try {
            ArrayList<Interger> arrayList = new ArrayList<>();
            while (scanner.nextLine()) {
                String str = scanner.nextLine();
                int a = Integer.parseInt(str);
                arrayList.add(a);
            }
            int[] array = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                array[i] = (int) arrayList.get(i);
            }
            scanner.close();
            return array;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i --) {
            for (int j = 0; j < i; j ++) {
                if (array[j] > array[j+1]) {
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            printArray(array);
        }
    }
    public static void main(String[] args) throws Exception {
        // int arrayLength = 5;
        String fileName = "integers.txt";
        // int[] array = createRandomArray(arrayLength);
        // printArray(array);
        // writeArrayToFile(array, fileName);
        int [] array = readArrayFromFile(fileName);
        bubbleSort(array);
        writeArrayToFile(array, fileName: "sorted.txt");
    }
}
