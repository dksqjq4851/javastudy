package ex08_exception_class;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("1234", 10000);
		
		
		//입금,출금,조회
		try {
		//me.deposit(10000);
			//me.withdraw(-15000);
			me.transfer(you, 5000);
			
			
		}catch(BankAccountException e) {
			System.out.println("에러코드[" + e.getErrorCode()+ "]");
			System.out.println(e.getMessage());
		}finally {
			me.inquiry();
			you.inquiry();
		}
	}

}
