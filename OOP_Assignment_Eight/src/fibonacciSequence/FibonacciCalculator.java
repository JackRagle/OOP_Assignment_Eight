package fibonacciSequence;

import java.io.IOException;

public class FibonacciCalculator {

	public static void main(String[] args) throws IOException {
		
		int index = Integer.parseInt(args[0]);
		System.out.println("The Fibonacci number at the index " + index + " is " + CalculateFibNum(index) + ".");
		
	}
	
	public static int CalculateFibNum(int index) {
		
		int fibNumStart = 0, fibNumNext = 1, x = 1;
		
		if(index == 0) {
			return 0;
		}
		
		do {
			
			x = fibNumNext;
			fibNumNext = fibNumStart + fibNumNext;
			fibNumStart = x;
			index--;
			
		}while(index > 0);
		
		return fibNumStart;
		
	}

}
