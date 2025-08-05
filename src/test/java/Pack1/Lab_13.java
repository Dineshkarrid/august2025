package Pack1;
import java.time.LocalDate;
import java.util.Scanner;
public class Lab_13 {
	public static void main (String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter purchasedate as format yyyy-mm-dd");
		LocalDate purchasedate=LocalDate.parse(sc.nextLine());
		System.out.println("enter expiry years");
		int year=sc.nextInt();
		System.out.println("enter expiry months");
		int month=sc.nextInt();
		LocalDate expirydate=purchasedate.plusYears(year).plusMonths(month);
		System.out.println("product will be expired on date of  "+expirydate);
	}

}
