package ex13_interface;
/*
 인터페이스
 1. 모든 메소드가 추상 메소드인 추상클래스입니다.
 2. jdk 1. 8 이후 default 메소드의 static 메소드를 가질 수 있습니다.
 3. 모ㅡㄴ 필드는 final 상수를 가집니다.
 
 
 */


public interface Shape { // interface <-> abstract class
	//method
	//모든 도형은 크기가 있다.
	public abstract double getArea();//interface 는 public abstract 를 생략해도 자동으로 삽입되서 처리됩니다.

}
