package Pack1;
class Person12{
	private String name;
	private float age;
	public Person12(String name, float age) {
		this.name =name;
		this.age=age;
	}
	public Person12(String name2, int age2) {
		// TODO Auto-generated constructor stub
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
abstract class Account1{
		private static long accCounter=1000;
		private long accnumber;
		protected double balance;
		private Person12 accholder;
		public Account1(double balance,Person12 accholder2) {
			this.balance=balance;
			this.accnumber=accCounter++;
			this.accholder=accholder2;}
		public void deposit(double amount) {
			balance+=amount;
			}
		public abstract void withdraw(double amount);
			
		public double getbalance() {
			return balance;
		}
			public long getaccnumber() {
				return accnumber;
			}
			public Person12 accholder()
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
class SavingsAccount extends Account1 {
    private final double MIN_BALANCE = 500;

    public SavingsAccount(double balance, Person12 accholder) {
        super(balance, accholder);
    }

    @Override
    public void withdraw(double amount) {
    	
		if((balance - amount)>=MIN_BALANCE) {
			balance-=amount;
        } else {
            System.out.println("Withdrawal denied: Minimum balance of ₹500 must be maintained.");
        }
    }
}
public class Lab_25{
	public static void main (String args[]) {
		Person12 Smith=new Person12("smith",67);
		Person12 Kathy=new Person12("kathy",98);
		Account1 smithacc=new SavingsAccount(5000,Smith);
		Account1 kathyacc=new SavingsAccount(1000,Kathy);
		 smithacc.deposit(600);
	        kathyacc.deposit(567);

	        smithacc.withdraw(80);
	        System.out.println("hi this is about creating bank accounts for people");

	        System.out.println(Smith);
	        System.out.println(smithacc);

	        System.out.println(kathyacc);
	        System.out.println(kathyacc.getbalance());
	        System.out.println(smithacc.getbalance());

	        smithacc.withdraw(567);
	        System.out.println(smithacc.getbalance());

	        System.out.println(Smith.getName());
	        Smith.setName("dinesh");
	        System.out.println(Smith.getName());
	        System.out.println(smithacc);
	    }
	}
	