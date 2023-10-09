package demo;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "    vasu karam   cutethali Ajuuuuu    ";
		str = str.trim();
		
		//String str1 = str.replaceAll("\\s", ""); // here \\s means spaces
		
	
		System.out.println(str);
		/*String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
		
		rev = rev + str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}*/
		
		
	/*	boolean result = ispalindrome(str);
		System.out.println(result);
	}

	public static boolean ispalindrome(String str) {
		// TODO Auto-generated method stub
		if(str==null) {
		return false;
		}
		if(str.length()<=1) {
			return true;
		}
		String first = str.substring(0,1);
		String last = str.substring(str.length()-1,str.length());
		if(first.equals(last)) {
			return ispalindrome(str.substring(1, str.length()-1));
		}else {
			return false;
		}*/
	}

}
