package ex03_exception_method;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//int a = 2/0;
			Integer.parseInt("1.5");
		}catch(ArithmeticException e) {
			//e에는 무엇이 포함되어 있는지 확인해 봅시다.
			System.out.println("예외 메시지 : " + e.getMessage());
			e.printStackTrace();//개발자가 넣어 두ㅡㄴ 코드
		}

	}

}
