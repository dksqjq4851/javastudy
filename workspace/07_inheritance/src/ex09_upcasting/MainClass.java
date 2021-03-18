package ex09_upcasting;

public class MainClass {

	public static void main(String[] args) {
		// upcasting이 없는경우
		// => 타입이 다르다 : 커피마다 커피를 담는 컵이 다르다고 볼수있디.
		Espresson espreson = new Espresson("코롬비아", 30);
		Latte latte = new Latte("인도네시아", 30, 150);
		espreson.info();
		espreson.taste();
		latte.info();
		latte.taste();
		//upcasting을 사용한 경우
		Coffee coffee1 = new Espresson("콜롬비아", 30);
		Coffee coffee2 = new Latte("인도네시아", 30, 150);
		coffee1.info();
		coffee1.taste();
		coffee2.info();
		coffee2.taste();

	}

}
