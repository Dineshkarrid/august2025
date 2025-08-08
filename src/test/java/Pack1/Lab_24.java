package Pack1;
interface Persondetails {
    void name(String firstname,String middlename,String lastname);
    void age(int age);
}

// Derived class implementing interface
class Emp implements Persondetails{

    @Override
    public void name(String firstname,String middlename,String lastname) {
        System.out.println(firstname+middlename+lastname);
    }

    @Override
    public void age(int x) {
        System.out.println("age is: "+x);
    }
}

// Main class to test
public class Lab_24 {
    public static void main(String[] args) {
        Persondetails employee = new Emp();
        employee.name("dinesh","kumar","karri");
        employee.age(24);
    }
}
