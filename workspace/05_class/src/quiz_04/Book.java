package quiz_04;
/*
메소ㅡ(method)
1.구성
 1)결과타입
 2)ㅔ소드명
 3)매개변수
2. 정의
	결과타입 메소드명(매개변수){
	메소드본문
	}
*/
public class Book {

	String  name;
	String writter;
	int price;
	
	void set(String n, String w, int p){
	name = n;
	writter = w;
	price = p;
	
	
	}
	void set(String n, String w) {
	set(n, w, 0);}
	
	void set(String n, int p) {
		set(n, "미상", p);
	}
	
	void info() {
		System.out.println(name);
		System.out.println(writter);
		System.out.println(price);
	}
}
