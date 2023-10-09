package demo;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//it is anagram program
		String str1 = "thilacute";
		String str2 = "Cutethali";
		
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given strings are Anagram");
		}else {
			System.out.println("Given strings are not Anagram");
		}
		
		}

		
		}


