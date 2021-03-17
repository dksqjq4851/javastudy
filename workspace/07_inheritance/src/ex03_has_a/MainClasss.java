package ex03_has_a;

//has - a 관계도 상속으로 처리할 수 있읍니다.
//circle has a coord 
//coord 클래스를 슈퍼클래스로 지정하고.
//circle클래스를 서브클래스로 ㅣ정합니다.
public class MainClasss {

	public static void main(String[] args) {
		//서브클래스인 circle의 객체가
		//정상적으로 생성되는지 확인, 
		Circle c = new Circle();
		c.setCircle(1, 1, 1.5);
		c.circleInfo();

		
	}

}
