package demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "cutte thali";
		//Approach-1
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int idx = str.indexOf(ch,i+1);
			if(idx==-1) {
				sb1.append(ch);
			}
		}
		System.out.println(sb1);
		//Approach 2
		char[] arr = str.toCharArray();
		StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			boolean repeated = false;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					repeated = true;
					break;
					
				}
			}
			if(!repeated)
			{
				sb2.append(arr[i]);
			}
		}
		System.out.println(sb2);
		
		//Approach3
		StringBuilder sb3 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character c : set)
		{
			sb3.append(c);
		}
		
				System.out.println(sb3);
			
		}
		
		
	}


