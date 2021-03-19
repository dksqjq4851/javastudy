package ex05_throw;

public class MainClass {

	public static void main(String[] args) {
		// 예외를 직접 발생시키는 경우 throw를 이용합니다.
		/*try {
			throw new NumberFormatException();
		}catch(Exception e) {
			System.out.println("에외가 발생했당");
			System.out.println(e);
		}
*/
		
		
		Calcultor cal = new Calcultor();
		try {
			cal.division(0);
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다." + e);
		}
	}

}
