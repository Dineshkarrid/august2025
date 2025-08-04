package Pack1;

public class Lab7 {

	static boolean isstringpositive(String str) {
	for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)>=str.charAt(i+1)) {
			return false;
		}
	}
	return true;
	}
	public static void main(String[] args) {
		if(isstringpositive("ant")){
			System.out.println("positive string");
		}
		else {
			System.out.println("negative string");
		}
	}

}
