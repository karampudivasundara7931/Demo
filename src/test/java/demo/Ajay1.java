package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ajay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,1,3};
		int sum=0;
		int expsum=0;
		Set<Integer> set = new HashSet<Integer>();
		for(int num:arr) {
			if(!set.add(num)) {
				System.out.println("Repeated num is" + num);
			}
			
		}
		System.out.println(set);
		
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
	
		for(int i=1;i<=3;i++) {
			expsum = expsum +i;
		}
		System.out.println(expsum);
		System.out.println(expsum-sum);
		
		//excel
		
		int n=35;
		int var=65;
		int start=64;
		int row=0;
		int k=0;
		for(int i=0;i<n;i++) {
			if(k==26) {
				k=0;
				
				start++;
				row++;
				var=65;
			}else if(row==0) {
				System.out.print((char)var+" ");
				var++;
				k++;
			}else {
				System.out.print((char)start +""+(char)var+" ");
				var++;
				k++;
			}
		}
	}

}
