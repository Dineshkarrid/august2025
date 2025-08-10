package Pack1;
import java.io.*;

public class Lab_41 {
    public static void main(String[] args) {
        String filePath = "sample.txt";

        try {
            
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            StringBuilder content = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }

            br.close();
            fr.close();
            String reversedContent = new StringBuilder(content.toString()).reverse().toString();
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(reversedContent);

            bw.close();
            fw.close();

            System.out.println("File content reversed successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
