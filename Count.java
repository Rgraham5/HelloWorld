import java.io.File; //to read file
import java.util.Scanner;

public class Count {
   public static void main(String[] args) throws Exception { 
      String filename = "WordCount.txt";
      File f = new File (filename);
      Scanner scan = new Scanner(f);
      int wordCnt = 1;

     while(scan.hasNextLine()){
      String text = scan.nextLine();
      wordCnt+= text.split("\\s+").length;  
}
          }
}System.out.println("Word count is "+wordCnt);

