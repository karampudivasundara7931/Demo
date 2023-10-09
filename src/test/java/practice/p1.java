package practice;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse a string
		String s = "CUTE".toLowerCase();
		/*StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();
		System.out.println(rev);*/
		//second method
		/*String rev ="";
		for (int i =s.length()-1; i>=0;i--) {
		
			rev = rev + s.charAt(i);
			
		}
		
	System.out.println(rev);*/
		//check vowel is present in string r not
		boolean isvowelpresent = false;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				isvowelpresent = true;
				break;
			}
		}
		if(isvowelpresent) {
			System.out.println("vowel is present");
		}else {
			System.out.println("vowel is not present");
		}
		
	}

}
