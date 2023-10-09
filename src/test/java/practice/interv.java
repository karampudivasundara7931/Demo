package practice;

import java.util.Arrays;

public class interv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* int[] arr = {1, 2, 6, 3, 4, 5, 9, 7, 8,6,4,5,9,5};
	      int sum=0;
	      
	      boolean flag = false;
	      for(int i=0;i<arr.length;i++){
	         if(arr[i]==6){
	        	 
	             break;
	            
	         }else if(arr[i]==9){
	        	 flag=true;
	                 continue;
	                 
	             }
	         if(flag) {
	         sum = sum+arr[i];
	         }
	         }
	        
	      
	      System.out.println(sum); */
		//print even numbers in an given array without odd in a sorted way
		int[] arr = {1,8,4,5,6,9,3,2,7,2,1};
		int[] even = new int[arr.length];
	       int evenCount=0;
	       for(int i=0;i<arr.length;i++){
	           if(arr[i]%2==0){
	        	   even[evenCount] = arr[i];
	        	   evenCount++;
	               
	           }
	           
	           }
	       int[] evenres = Arrays.copyOf(even, evenCount);
	       Arrays.sort(evenres);
	       System.out.println(Arrays.toString(evenres));
		
        
	}

}
