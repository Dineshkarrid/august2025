package Pack1;

import java.util.Scanner;

class person1 {
	    String FirstName;
	    String MiddleName;
		String LastName;
		char Gender;
		public person1(String FirstName,String MiddleName, String LastName, char Gender) {
			this.FirstName = FirstName;
			this.MiddleName=MiddleName;
			this.LastName = LastName;
			this.Gender = Gender;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFisrtName(String FirstName) {
			this.FirstName = FirstName;
		}
		public void setMiddleName(String Middlename) {
			this.MiddleName=Middlename;
		}
		public String getMiddleName() {
			return MiddleName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String LastName) {
			this.LastName = LastName;
		}
		public char getGender() {
			return Gender;
		}
		public void setGender(char Gender) {
			this.Gender = Gender;
		}
		

}
public class Lab_6{
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter mobile number");
		long x=sc.nextLong();
		person p1=new person("dines","kumar","karri",'m');
		System.out.println("-------------");
		System.out.println("Firstname is:"+p1.getFirstName());
		System.out.println("middlename is:"+p1.getMiddleName());
		System.out.println("Lastname is:"+p1.getLastName());
		System.out.println("gender:"+p1.getGender());
		System.out.println("mobile number is"+x);
	}
	
}
