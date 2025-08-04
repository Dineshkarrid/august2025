package Pack1;

import java.util.Scanner;

class person2 {
	   private enum Gender{m,f};
	   private  String FirstName;
	  private  String MiddleName;
	  private String LastName;
		private Gender gender;
		public person2(String FirstName,String MiddleName, String LastName, char genderChar) {
			this.FirstName = FirstName;
			this.MiddleName=MiddleName;
			this.LastName = LastName;
			setGender(genderChar);
		}
		private void setGender(char genderChar) {
			 this.gender = Gender.valueOf(String.valueOf(genderChar));
			
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
		public String getGender() {
			return (gender!=null)?gender.toString():"invalid";
		}
		
}
public class Lab_8{
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter mobile number");
		long x=sc.nextLong();
		System.out.println("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);
		person p2=new person("dines","kumar","karri",gender);
		System.out.println("-------------");
		System.out.println("Firstname is:"+p2.getFirstName());
		System.out.println("middlename is:"+p2.getMiddleName());
		System.out.println("Lastname is:"+p2.getLastName());
		System.out.println("gender:"+p2.getGender());
		System.out.println("mobile number is"+x);
	}
	
}



