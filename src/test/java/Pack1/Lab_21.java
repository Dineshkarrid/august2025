package Pack1;
class Person{
	private String name;
	private float age;
	public Person(String name, float age) {
		this.name =name;
		this.age=age;
	}
	public String getName() {return name;
}
	public float getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(float age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return "name  :" +name +"\nage  :" +age;
	}}
class Account{
		private static long accCounter=1000;
		private long accnumber;
		private double balance;
		private Person accholder;
		public Account(double balance,Person accholder) {
			this.balance=balance;
			this.accnumber=accCounter++;
			this.accholder=accholder;}
		public void deposit(double amount) {
			balance+=amount;
			}
		public void withdraw(double amount) {
			if((balance - amount)>=500) {
				balance-=amount;
			}else {
				System.out.println("denied withdraw,minimum 500 maintained");
			}
		}
		public double getbalance() {
			return balance;
		}
			public long getaccnumber() {
				return accnumber;
			}
			public Person accholder()
			{
				return accholder;
			}
@Override
public String toString() {
	return "accountnumber:"+accnumber+
			"\nholder: " +accholder+
			"\nbalance: " +balance;
			
}

	}
	
public class Lab_21 {
public static void main(String args[]) {
	Person smith=new Person("smith",55);
	Person kathy=new Person("kathy",33);
	Account smithacc=new Account(5000,smith);
	Account kathyacc=new Account(9999,kathy);
	smithacc.deposit(600);
	kathyacc.deposit(567);
	smithacc.withdraw(80);
	System.out.println(smith);
	System.out.println(smithacc);

System.out.println(kathyacc);
System.out.println(smith.getName());
smith.setName("dinesh");
System.out.println(smith.getName());
System.out.println(smithacc);
}
}
