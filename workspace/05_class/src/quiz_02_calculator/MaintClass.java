package quiz_02_calculator;

public class MaintClass {

	public static void main(String[] args) {
		Calculator calc;//객체는 없고, 참조 변수만 있는 상태입니다.
		//객체를 만드는 명령은 'new'입니다.
		calc = new Calculator();
		calc.addtion(1, 2);
		int a = 5;
		int b = 10;
		if(a>=b) {
			System.out.println(a+"-"+b+"="+calc.subtraction(a, b));
		}else {
			System.out.println(b+"-"+a+"="+calc.subtraction(a, b));
			
		}
		// TODO Auto-generated method stub

	}

}
