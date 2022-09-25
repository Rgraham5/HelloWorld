import java.util.Scanner;

import javax.sql.StatementEventListener;
import javax.swing.ComponentInputMap;

public class ClassDemo {

    public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum){
        float targetNum;
        switch(sourceMetric){
            case "Km":
            switch (targetMetric){
                case "m":
                targetNum = sourceNum * 1000;
                break;
                case "mile":
                targetNum = sourceNum / (float) 1.6;
                break;
                default:
                System.out.println(x: "Invalid");
            }
        }
        System.out.printf(format: "%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
        return targetNum;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str;        
        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;
        while (true) {
            System.out.println(x:"metric input to convert: kg to lb");
            String str = scanner.nextLine();
            if (str.equals(anObject: "exit")) {
                System.out.println("Thank you, Bye!");
                scanner.close();
                break;
            }            
            strArray = str.split(regex: " ")
            if (strArray.length != 4) {
                System.out.println(x: "Invalid Input.");
                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
                metricConverter(sourceMetric, targetMetric, sourceNum);
            }
         } 
        scanner.close()
    }    
}