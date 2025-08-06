package Pack1;
import com.cg.eis.exception.EmployeeException; 
class Employee1 {
    private int id;
    private String name;
    private double salary;

    public Employee1(int id, String name, double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be at least ₹3000");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be at least ₹3000");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
               "\nName: " + name +
               "\nSalary: " + salary;
    }
}
public class Lab_33 {
	public static void main(String args[]) {
		Employee1 emp=null;
	try {
 emp=new Employee1(1,"dinesh",55000.0);
System.out.println(emp);
Employee1 emp2=new Employee1(2,"kumar",1000);System.out.println(emp2);
}catch(EmployeeException e) {
	System.out.println("exception caught:" +e.getMessage());
}
	try{
		if(emp!=null) {
		emp.setSalary(333.0);}}
	catch(EmployeeException e) {
		e.printStackTrace();
	}
	int x=89;
	int y=98;
	System.out.println("using exception handling if we got error also program dont stops its execution or terminates continues execution by handling that exception "+(x+y));
	}}
