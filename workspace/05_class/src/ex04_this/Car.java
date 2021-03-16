package ex04_this;
//this
/*
 
 1.this 는 객체 자신을 의미합니다.
 2. 어떤 클래스 내부에서만 상ㅇ합니다.
 3. 활용
 1)this.필드 (가장 주된 활용
 2)this()
 */
public class Car {
	
	
	String model;
	String manufacturer;
	int price;
	
	void set(String model, String manufacturer, int price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	void info() {
		System.out.println("모델명: " + model );
		System.out.println("제조사 : "  + manufacturer );
		System.out.println("가격: " + price + "만원" );
	}

}
