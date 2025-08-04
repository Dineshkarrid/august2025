package Pack1;
import java.util.Scanner;
public class Lab_10 {
	static boolean isstringpositive(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1)) {
				return false;
			}
		}
		return true;}
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	if(isstringpositive(input)) {
		System.out.println("string is positive");
	}else{System.out.println("string is negative");}
}

}
