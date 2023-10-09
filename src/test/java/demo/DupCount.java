package demo;

import java.util.HashMap;
import java.util.Map;

public class DupCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Cute thalii";
		Map<Character,Integer> dupCharMap = new HashMap<Character, Integer>();
		char[] charArr = str.toCharArray();
		for(char keys : charArr)
		{
	 if(Character.isAlphabetic(keys))
	 {	
				if(dupCharMap.containsKey(keys))
				{
					dupCharMap.put(keys, dupCharMap.get(keys)+1);
				}
				else
				{
					dupCharMap.put(keys, 1);
				}
	 }
			
		}
        
		System.out.println(dupCharMap);
	}

}
