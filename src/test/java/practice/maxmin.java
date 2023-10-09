package practice;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr = {1,2,3,4,5}; //14 ,10
		int max =0;
		int min =0;
		for(int i=1;i<=arr.length-1;i++) {
			max = max + arr[i];
		}
  
		System.out.println("max is" + "" +max);
		for(int i=0;i<=arr.length-2;i++) {
			min = min + arr[i];
		}
  
		System.out.println("min is" + "" +min);*/
		

		        int[] numbers = {3, 5, 1, 9, 7};


		        int min = Integer.MAX_VALUE;

		        int max = Integer.MIN_VALUE;

		        int sum = 0;


		        for (int num : numbers) {

		            if (num < min) {

		                min = num;

		            }

		            if (num > max) {

		                max = num;

		            }

		            sum += num;

		        }


		        int sumExcludingMin = sum - min;

		        int sumExcludingMax = sum - max;


		        System.out.println("Sum excluding minimum: " + sumExcludingMin); // Output: 24

		        System.out.println("Sum excluding maximum: " + sumExcludingMax); // Output: 16

		    }

		}
