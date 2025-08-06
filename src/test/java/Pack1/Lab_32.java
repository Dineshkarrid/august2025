package Pack1;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class Person32 {
    private String name;
    private float age;

    public Person32(String name, float age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        }else {
        this.name = name;
        this.age = age;}
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(float age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "name  :" + name + "\nage  :" + age;
    }
}
public class Lab_32 {
	public static void main(String args[]) {
        try {
            Person32 smith = new Person32("smith", 55); 
            Person32 kathy = new Person32("kathy", 10); 

            System.out.println("Person 1: " + smith);
            System.out.println("Person 2: " + kathy);

        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}
