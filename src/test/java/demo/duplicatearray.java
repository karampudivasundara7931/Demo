
package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArr = { 8,2,3,4,2,5,7,8,7,9};
		duplicatearray.findduplicatesbrutemethod(inputArr);
		duplicatearray.findduplicatesusingSort(inputArr);
		duplicatearray.findduplicatesusingHashset(inputArr);
		duplicatearray.findduplicatesusingHashMap(inputArr);
	}
	private static void findduplicatesbrutemethod(int[] arr) {
		for (int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicates are :" + arr[i]);
				}
			}
		}
		
	}

	private static void findduplicatesusingSort(int[] arr) {
		Arrays.sort(arr);
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println("Duplicates using sorting are :" + arr[i]);
			}
		}
		
	}
	private static void findduplicatesusingHashset(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for(int dupset : arr) {
			if(!set.add(dupset)) {
				
				System.out.println("Duplicates using hashset are :" + dupset);
			}
		}
		
		}
	private static void findduplicatesusingHashMap(int[] arr) {
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int x : arr) {
			if(!hm.containsKey(x)) {
				hm.put(x, 1);
			}else {
				hm.put(x, hm.get(x)+1);
			}
		}
		for(Integer x : hm.keySet()) {
			if(hm.get(x)>1) {
				System.out.println("Duplicates using hashmap are :" + x);
			}
		}
		
			}
		}
	
	
	
	

