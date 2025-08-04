package Pack1;

public class Lab_9 {
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
		String str4="dinesh programming";
	       StringBuffer str5=new StringBuffer();
	       for (int i=0;i<str.length();i++) {
	    	   
	    	   if(i%2 == 0) {
	    		   
	    		   str5.append(str.charAt(i));
	    	   }else {
	    		   str5.append("*");
	    	   }
	       }
	       System.out.println(str5.toString());
	       
	       StringBuffer str6=new StringBuffer();
			for(int i=0;i<str.length();i++) {
				
				char ch=str.charAt(i);
				if(i%2 == 0) {
					str6.append(Character.toUpperCase(ch));
				}
				else {
					str6.append(ch);
				}
			}
	System.out.println(str6.toString());
	
	
		}

	}


