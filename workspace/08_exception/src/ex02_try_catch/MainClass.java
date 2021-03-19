package ex02_try_catch;
/*
 
 	try{
 		코드작성
 		예외발생가능구역
 		
 		}catch(예외처리 매개변수){
 */






public class MainClass {

	public static void main(String[] args) {
		int a = 0;
		// TODO Auto-generated method stub
		try {
			Integer.parseInt("1.5");
			a = 10;
		}catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		}catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다. 2");
		}
		System.out.println(a);

		
		
		
		
		try {
			//String name = null;
			//name.equals("james");
			int [] b= new int[3];
			b[10] = 10;
		}catch (Exception e) {
			System.out.println("예외가 발생했습니다.");// TODO: handle exception
		}
		
		
		
		
	}

}
