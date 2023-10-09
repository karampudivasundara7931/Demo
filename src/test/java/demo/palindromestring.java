package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* String s="vasu";
	        
	        char ch[] = s.toCharArray(); 
	        String reverse="";
	        for(int i=ch.length-1;i>=0;i--){
	            reverse = reverse + ch[i];
	        }
	        System.out.println(reverse);
	        System.out.println(s);
	        if(reverse.equals(s)) {
	        	System.out.println("Given string is palindrome");
	        }else {
	        	System.out.println("Given string is not palindrome");
	        }*/
		
		//frequent number 
		
		        int[] array = {0,1,1,0,0,1,1,1,0,0,1,1,1,1,0,1,0}; // Change this to your array

		        int mostFrequent = 0; // Store the most frequent element
		        int maxCount = 0; // Store the maximum count of any element

		        for (int i = 0; i < array.length; i++) {
		            int count = 0; // Count the frequency of the current element

		            for (int j = 1; j < array.length; j++) {
		            	 
		                if (array[i] == array[j]) {
		                    count++;
		                }
		                
		            }

		            if (count > maxCount) {
		                maxCount = count;
		                mostFrequent = array[i];
		            }
		            
		        }
		        

		        System.out.println("Maximum count " + maxCount);
		        System.out.println("Most frequent element: " + mostFrequent);
		        
		    }
		

	            
	        }
	        
	

	        
	        
	


