package ex10_downcastig;

public class MainClass {

	public static void main(String[] args) {

		//컴파일 -> 실행
		//코드 -> new
		
		Person p1;
		p1 = new Student();
		p1.eat();
		p1.sleep();
		//p1.study();
		//p1을 student 타입으로 변경하면 해결됩니다.
		//person타입의 p1을 studnt 타입으려 변경하면 해결됩니다.
		//1.(Student)p1 : p1을 student로 캐스팅합니다.
		//2.(Student)p1.study() : 종상 동작하지 않습니다.
		// 연산시 최우선 쉰위 : 마침표(.)
		//((Student)p1).study()
		((Student)p1).study();
		Person p2 = new Worker();
		p2.eat();
		p2.sleep();
		((Worker)p2).work();
		Person p3;
		p3 = new Student();
		p3.eat();
		p3.sleep();
		//((Worker)p3).work();

		//타입을 확인한 뒤 캐스팅 할수있습니다.
		//p3가 Student이면 student로 캐스팅하고
		//p3가 워커이면 워커로 캐스팅하라
		if(p3 instanceof Student) {
			((Student)p3).study();
		}else if(p3 instanceof Worker) {
			((Worker)p3).work();
		}
	}

}
