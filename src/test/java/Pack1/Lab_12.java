package Pack1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Lab_12 {
	public static void main (String args[]) {
System.out.println("enter date 1 as yyyy-mm-dd");
Scanner sc=new Scanner(System.in);
LocalDate date1=LocalDate.parse(sc.nextLine());
System.out.println("enter date2 as yyyy-mm-dd");
LocalDate date2=LocalDate.parse(sc.nextLine());
if(date1.isAfter(date2)) {
	LocalDate temp=date1;
	date1=date2;
	date2=date1;
}
Period p1=Period.between(date1,date2);
System.out.println("period between dates");
System.out.println("years:"+p1.getYears());
System.out.println("months:"+p1.getMonths());
System.out.println("days:"+p1.getDays());

sc.close();
}
	}
