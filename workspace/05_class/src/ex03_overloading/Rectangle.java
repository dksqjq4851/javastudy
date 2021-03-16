package ex03_overloading;

public class Rectangle {
/*
 	오버로딩(overloading)
 	1. 이름이 같고, 매개변수가 다른 메소드가 있음을 의미한다.
 	2. 결과타입은 오버로딩과 상관이 없습니다.
 */
	int width;
	int height;
	
	void set(int w, int h) {
		if(w>0) {
		width = w;}
		if(h>0) {
		height = h;}
	}
	void set(int n) {
		//다른 set() ㅔ소드를 호출해서 처리합니다.
		set(n, n);
		
	}
	int getArea(){
		return width*height;
	}
	
}
