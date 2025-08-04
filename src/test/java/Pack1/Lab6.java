package Pack1;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dinesh Programming";
		StringBuffer str2=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(i%2 == 0) {
				str2.append(Character.toUpperCase(ch));
			}
			else {
				str2.append(ch);
			}
		}
System.out.println(str2.toString());
	}

}
