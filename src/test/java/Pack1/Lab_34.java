package Pack1;
import java.util.Arrays;

public class Lab_34 {
    public static void main(String[] args) {
        String[] names = {
            "dinesh",
            "pooja",
            "raju",
            "vishnu",
            "siva",
            "brahma"
        };
        System.out.println("Original List:");
        for (String name : names) {
            System.out.println(name);
        }
        Arrays.sort(names);
        System.out.println("\nSorted Product List:");
        for (String product : names) {
            System.out.println(product);
        }
    }

}
