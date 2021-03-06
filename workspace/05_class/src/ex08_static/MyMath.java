package ex08_static;

public class MyMath {

	//private 생성자 -> MyMath 내부에서만 생성이 가능합니다.
	private MyMath() {}
	
	public static final double PI = 3.141592;
	
	public static double abs(double n) {
		return(n>0 ? n :-n);
	}
	//제곱
	public static double pow(double a, double b) {
		double result = 1;
		for(int i =0 ; i<b;i++) {
			result *= a;
		}
		return result;
	}
}
