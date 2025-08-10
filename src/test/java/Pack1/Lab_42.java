package Pack1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab_42 {
    public static void main(String[] args) {
        String fileName = "numbers.txt";

        try {
            FileWriter fw = new FileWriter(fileName);
            for (int i = 0; i <= 10; i++) {
                fw.write(i + (i < 10 ? "," : "")); 
            }
            fw.close();
            System.out.println("File created: " + fileName);
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");

            System.out.println("Even numbers from file:");
            while (sc.hasNext()) {
                String numStr = sc.next().trim();
                int num = Integer.parseInt(numStr);
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }

            sc.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}