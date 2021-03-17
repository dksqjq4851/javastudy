package ex01_is_a;

//student가 eat()을 사용하고자합니다.ㅣ
/*
 	상송(inheritance)
 	1. 어떤 클래스가 다른 크래스의 기능을 확장하는것을 의미합니다
 	2. 상속이 가능한 대표적인 클래스들의 관계는 is-a 관계입니다.
 	3. IS-A
 		Person is a Student.
 		Student is a perason. -> is-a ㅘㄴ꼐 ㅅ어
 	4. Student 는 Person 의 기느을사용할 수 이ㅏ습니다.
 	
 	
 	슈퍼클래스와 서브클래스
 	1.슈퍼클래스 : 부모클래스라고도 ㅎㅂ니다.마
 	2.서브클래스 : 자식클래스라고도합니다. 다른캘래스의 메소드를 제공받는 크래스입ㄴ'
 	3.형식
 		class 슈퍼크래스{}
 		class 서브캘르스 extends 서브클래스{}
 
 
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.eat();
		
		Student s = new Student();
		s.study();
		s.eat();

	}

}
