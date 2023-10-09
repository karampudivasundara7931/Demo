package practice;

import java.util.HashMap;
import java.util.Map;

public class FindSpecCharNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Vasu@1234";
		char[] ch = s.toCharArray();
		int specialCharCount = 0;
        int numberCount = 0;
        int capitalLetterCount = 0;
        int smallLetterCount = 0;
        
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				
				numberCount++; 
				
			}else if(Character.isUpperCase(ch[i])) {
				capitalLetterCount++;
				
			}else if(Character.isLowerCase(ch[i])) {
				smallLetterCount++;
				
			}else {
				specialCharCount++;
				
			}
		}
		
		System.out.println("Special Characters: " + specialCharCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Capital Letters: " + capitalLetterCount);
        System.out.println("Small Letters: " + smallLetterCount);
        
        //change lower to upper
        String s1="vasu karam";
        String res="";
        char[] ch1 = s1.toCharArray();
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]=='v'){
                ch1[i]='V';
            }else if(ch1[i]=='k'){
                ch1[i]='K';
            }
            res = res+ch1[i];
        }
        
        System.out.println(res);
	}

}
