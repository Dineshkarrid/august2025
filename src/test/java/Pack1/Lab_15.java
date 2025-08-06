package Pack1;
import java.time.LocalDate;
import java.time.Period;

class Person1{
    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;
    private int age;
    private double weight;
    
	/*public void Person1() {
        this.firstName = "";
        this.lastName = "";
        this.gender = 'U';
        this.age = 0;
        this.weight = 0.0;
    }*/
    public Person1(String firstName,String middleName, String lastName, char gender, double weight) {
        this.firstName = firstName;
        this.middleName=middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.weight = weight;
    }
    public void calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        if ((dob != null) && (dob.isBefore(currentDate))) {
            this.age = Period.between(dob, currentDate).getYears();
        } else {
            this.age = 0;
        }
    }
    public String getFullName(String firstName, String lastName) {
        return firstName + " " +middleName+ " "+ lastName;}
    public void displayPersonDetails() {
        System.out.println("------- Person Details -------");
        System.out.println("Full Name : " + getFullName(firstName, lastName));
        System.out.println("Gender    : " + gender);
        System.out.println("Age       : " + age);
        System.out.println("Weight    : " + weight);
        System.out.println("------------------------------");
    }
}
public class Lab_15 {
	public static void main(String args[]) {
		Person1 p1=new Person1("karri","dinesh","kumar",'m',50.0);
		LocalDate dob=LocalDate.of(2000,02,01);
		p1.calculateAge(dob);
		p1.displayPersonDetails();
	}

}
