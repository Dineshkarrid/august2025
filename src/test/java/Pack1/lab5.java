package Pack1;

public class lab5 {

	public static void main(String[] args) {
       String str="dinesh programming";
       StringBuffer str2=new StringBuffer();
       for (int i=0;i<str.length();i++) {
    	   
    	   if(i%2 == 0) {
    		   
    		   str2.append(str.charAt(i));
    	   }else {
    		   str2.append("*");
    	   }
       }
       System.out.println(str2.toString());
	}

}
