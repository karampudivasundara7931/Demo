package demo;

public class fibonacciseriex {
	//with recursion
	// fibonocci series
	//for factorial we need to change few things like fact
	static int fibo(int n) {
		if(n==1 || n==2) {                       // for fact if(n==1) return 1;
			return 1;
		}
		return fibo(n-1) + fibo(n-2);                // for fact return (n* fact(n-1))
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recursion is A recursive function solves a particular problem by calling a copy of itself and solving smaller subproblems of the original problems
        //fibonnaci series is 1 1 2 3 5 8 13 which means we need to add one after other which is 1+1 is 2 then 2+1 is 3 then 3+2 is 5
		//without recursion
		/*int a=0,b=1;
		int c;
		//a=0,b=1;c=a+b=1,2,3,5;	a=b;a=1,1,2 ;b=c;b=1,2,3
		for(int i=0;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}*/
		
		System.out.println(fibo(6));
		/*
		 * import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result=1;
        for(int i =1;i<=num;i++){
            result = result * i;
        }
        System.out.println(result);
    }
}
		 */
		
	}

}
