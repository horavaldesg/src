
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fact(6));
	}
	static int fact(int n) {
		//Long way
		/*
		int result = 1;
		for(int i = n; i >= 1; i--) {
			result = result * i;
			
			
		}
		*/
		
		//Short way
		
		if(n == 1) {
			return 1;
		}
		else {
			return n * fact(n - 1);
		}
	
		
	}
	static int fib(int n) {
		if(n <= 2) {
			return 1;
		}
		else
		return fib(n-1) + fib(n-2);
	}
}
