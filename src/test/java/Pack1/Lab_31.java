package Pack1;
class invalidexception extends Exception{
	public invalidexception(String message) {
		super(message);
	}
}
class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) throws invalidexception {
        if (firstName == null || firstName.trim().isEmpty() ||
            lastName == null || lastName.trim().isEmpty()) {
            throw new invalidexception("First name and Last name must not be blank.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
public class Lab_31  {
public static void main(String rags[]) {
	try {
	Employee emp=new Employee("dinesh","kumar");
	System.out.println("full name is :"+emp.getFullName());
	}catch(invalidexception e) {
		System.out.println(e.getMessage());
	}

}}
