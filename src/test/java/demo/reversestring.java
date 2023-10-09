package demo;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*method-1 using string buffer
		String str = "vasuu";
		StringBuffer sb = new StringBuffer(str);
		String result = sb.reverse().toString();
		System.out.println(result);
		
		//method-2 without using string buffer
		String result1 ="";
		for(int i=str.length()-1;i>=0;i--) {
			 result1 = result1 +str.charAt(i);
		}
		System.out.println(result1);*/
		/*how to print first four char and last four char and middle one ex www.vasu.com ;i need o/p first four as www.,middle as vasu and last as .com
		String str = "www.vasu.com";
		String firstfour = str.substring(0, 4);
		System.out.println(firstfour);
		String lastfour = str.substring(str.length()-4, str.length());
		System.out.println(lastfour);
		String middle = str.substring(4,str.length()-4);
		System.out.println(middle);*/
		/* how to reverse whole word sentence ,in the given ex , ans is thali cute saranghe
		String str = "saranghae cute thali";
		String result1 ="";
		String[] arr = str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			result1 = result1 + arr[i]+" ";
		}
		System.out.println(result1);*/
		String str = "I miss you CuteThali";
		/*String result ="";
		String[] arr = str.split(" ");
		for(String word :arr) {
			String reverse="";
			int j = word.length()-1;
			while(j>=0) {
				char ch = word.charAt(j);
				reverse = reverse + ch;
				j--;
				
			}
			result = result + reverse +" ";
		}
		System.out.println(result);*/
		/*if we want this print lower upper to count of those so we need to change this 
		int lower =0;
		int upper = 0;*/
		String lower ="";
		String upper ="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>= 'A' && ch<='Z') {
				upper = upper + ch; //upper++ for int
			}else {
				lower = lower + ch; // lower++ for int
			}
		}
		
		System.out.println(lower);
		System.out.println(upper);
	}

}
