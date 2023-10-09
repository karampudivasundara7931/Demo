package practice;

import java.util.Arrays;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //pyramid series-check in book and mentioned detailed about it
	/*	int i;
		int j;
		int k;
		int n=5;
		for(i=1;i<=n;i++) {
			for(k=1;k<=n-1;k++) {
				System.out.println(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.println("* ");
			}
			System.out.println();
		}*/
		//to check whether two array elements have same number
		/*int arr1[] = {2,7,4,8,1};
		int arr2[] = {4,2,7,1,8};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean decision = Arrays.equals(arr1, arr2);
		if(decision==true) {
			System.out.println("it contains same elements");
		}else {
			System.out.println("dont contains same elements");
		}*/
		//program for sum of integer vales in am array
		/*int arr[] = {4,7,3,8,5,1,0};
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);*/
		int arr[] = {3,2,5,9,223,45,12};
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(arr[n-2]);
	}

}
