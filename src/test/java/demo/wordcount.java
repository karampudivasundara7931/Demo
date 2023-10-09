package demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class wordcount {

	public static <word> void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i dont like the way i am like this way way";
		/*Map<String,Integer> wordcount = new HashMap<String,Integer>();
		Integer count = 1;
		String[] arr = str.split(" ");
		for( int i =0;i<arr.length;i++) {
			
			if(wordcount.containsKey(arr[i])) {
				wordcount.put(arr[i],wordcount.get(arr[i])+1);
			}
			else {
				wordcount.put(arr[i], count);
			}
		}
		for (String x : wordcount.keySet())
		System.out.println("count of word :" +x+"="+wordcount.get(x));*/
		Set<String> hs = new LinkedHashSet<String>();
		String[] arr = str.split(" ");
		 for(String x : arr) {
			 if(hs.add(x)) {
				 System.out.println("%s" + x);
			 }
		}

	}

}
