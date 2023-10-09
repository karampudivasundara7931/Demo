package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class counteachchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "vasuv";
		
		
	//	int result = str.length()-str.replaceAll("j", "").length();
	//	System.out.println(result);
          Map<Character,Integer> map = new HashMap<Character,Integer>();
          //Linkedhash map maintains insertion order 
          int count=1;
          
          char[] arr = str.toCharArray();
          
          for(int i =0;i<arr.length;i++) {
        	  if(Character.isAlphabetic(arr[i])) {
          if(map.containsKey(arr[i])) {
        	  map.put(arr[i], map.get(arr[i])+1);
          }else {
        	  map.put(arr[i], count);
          }
        	  }
          }
         /*print count for each repeated string
         for(Character keys : map.keySet()) {
        	  if(map.get(keys)>1) {
        		  System.out.println("duplicates are" +" "+keys + map.get(keys)); */
          //print the first non repeatedcharacter
          for(Entry<Character,Integer> entry:map.entrySet()) {
        	  if(entry.getValue()==1) {
        		  System.out.println("first non repeatedvalue " +" "+ entry.getKey());
        		  
        	  }
          }
	}
          
	}


 