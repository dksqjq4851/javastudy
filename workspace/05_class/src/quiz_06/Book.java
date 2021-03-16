package quiz_06;

public class Book {
	String title;
	String writter;
	int price;
	
	
		
	Book(String title, String writter, int price){
		this.title = title;
		this.writter = writter;
		this.price = price;
	}
	Book(String title, int price){
		this(title, "미상", price);
	}
	Book(String title, String writter){
		this(title, writter, 0);
	}
	Book(){
		this("없음", "미상", 0);
	}

void info() {		System.out.println(title);
System.out.println(writter);
System.out.println(price);
}
		
	
	
}
