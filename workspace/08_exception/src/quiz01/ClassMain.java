package quiz01;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//계산기르 만들고,
		//4가지 연산을 모두 수행하고.
		//발상핼수있는 예외를 예상해서 처리해 봅시다.
		Calcultor cal = new Calcultor();
		cal.addition(8);
		cal.subtraction(2);
		cal.multiplication(-2);
		try {
			cal.division(0);
		}catch(Exception e) {
			System.out.println("에러가 발생햇습니다.");
		}

	}

}
