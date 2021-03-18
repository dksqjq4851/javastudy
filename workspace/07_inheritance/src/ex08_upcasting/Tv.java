package ex08_upcasting;

public class Tv extends Elec{
	//field
	private String model;
	//constructor

	public Tv(int watt, String model) {
		super(watt);
		this.model = model;
	}
	//method
	@Override
	public void info() {
		System.out.println("모델명" + model );
		super.info();
		
		//메소드의 호출
		//.객체의 타입에 따라 결정됩니다
		/*
		호풀할메소를 결저하는 것을 "바인디이라고 표현하니ㅏ.
		2. 자바는 동적바ㅣㄴ딩입니다.
		1)메소드 호출 전에ㅡㄴ 객채의타입을 봅니다.
		lec elce = tv 이미ㅡㅗ elev ifo ㅡㄴ elec의info입니다.
		2. 실제 객체를 확인합니다.tvtv=new tv  
		 */
	}
	

}
