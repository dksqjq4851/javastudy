package quiz_02_calculator;

public class Calculator {
	//method
	//1. 결과타입 : ㄱㄹ과값이 없다. (void)
	//2 ㅔ소등: addion
	//3:매개변수 : 전달되는 2개의 it 값이 있다
	//4:역할 : 전달된 인수의 합계 결과를 아래와 가은 형식으로 봉줍니다
	// 1 + 2 =3
	
	void addtion(int a, int b) {
		System.out.println(a +  "+" + b + "=" + (a+b));
		
	}
	//1. 결과타입 : 결과값의 타입이 int입니다.
	//2. 메소드명 : subtraction
	//3. ㅐ개변수: 전달되는 2개의 int값이 있다.
	//4. 역할 : 전달된 인수의 뺄셈 결과를 반환합니다. 항상 큰수에서 작은수를 뺍니다.
	
	int subtraction(int a, int b) {
		if(a>=b) {
			int subtraction = a-b;
			return subtraction;
		}else {
			int subtraction = b-a;
			return subtraction;
		}
	}

}
