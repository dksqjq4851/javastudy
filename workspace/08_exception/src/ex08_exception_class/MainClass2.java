package ex08_exception_class;

public class MainClass2 {
	//main() 메소드가 던진 예외는 jvm이 처ㅣ합니다.

	public static void main (String[] args) throws BankAccountException {
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("1234", 10000);
		
		me.deposit(10000);
		me.inquiry();
		you.inquiry();
		
	}

}
