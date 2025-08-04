package Pack1;

public class Lab4 {

	public static void main(String[] args) {
		String str="dinesh";
		System.out.println(str+str);
		String str3="java programming";
		StringBuffer str2=new StringBuffer();
		for (int i=0;i<str3.length();i++) {
			char ch=str3.charAt(i);
			if(str2.indexOf(String.valueOf(ch)) == -1) {
				str2.append(ch);
			}
		}
		
		System.out.println(str2.toString());
	}

}
