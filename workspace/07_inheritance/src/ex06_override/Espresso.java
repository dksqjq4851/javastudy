package ex06_override;

public class Espresso extends Coffee {
	//field
	private int water;
	//constructor

	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	@Override
	public void taste() {
		System.out.println("에스프레소는 향이좋지만 씁니다.");
	}
	
	//method
	//expresso 클래스는 이미 coffee 클래스의 메소드를 사용할수있습니다.
	//expresso 클래스가 coffee 클래스의 taste()메소들ㄹ 사용하는것이 적저할까요?
	// no1 espresso 클래스는 자시늬 맛을 표현하기 위해서 새롭게 taste()메소드를 만드는것이 좋습니다.
	
	//메소드 오버라이드
	//슈퍼클래스의 메소드를 사용하지 않기 위해서,
	// 서브 클래스가 메소드를 다시 만드는 것을 의미합니다.
	//유사단어 : 오버로딩과 오버라이드는 전혀 다르므로 주의

	//오버라이드 주의점
	//1. 똑같은형태로 만듭니다. 똑가지 않으면 오버라이드가 압니다.
	//2. @override 애너테이션 을 작성해 줍니다.
		//1) 개발자가 ㅏ바에게 이 메소드는 오버라이드 하는 것이라고 알리는 것입니다.
	//2) 그러면 자바는 오버라이드 규칙을 어겼을 경우 오류를 발생시켜 줍니다.
	
}
