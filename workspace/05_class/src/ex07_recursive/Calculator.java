package ex07_recursive;

public class Calculator {
	
	
	//역할 : n! 값
	// 3! (3패토리얼) == 1*2*3
	public int getFactorial(int n) {
		//return 3*2*1;
		if (n == 1) {
			return n;
		}else {
			return n*getFactorial(n-1);
		}
		
	}

}
