package ex06_exception_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpDown {

	private int answer; //발생된 난수
	private int count;
	private Scanner sc= new Scanner(System.in);
	
	//constuctor
	public UpDown(){
		answer = (int)(Math.random()*100) + 1;
		
	}
	//method
	public int challenge() throws UpDownException, InputMismatchException{
		count++;
		System.out.println("1~100사이의 정수를 입ㄺ하세요 >>>");
		int n = sc.nextInt(); // 입력이 int가 아니면 inputnum~ 이 발생합니다.
		if(n<1 || n>100) {
			throw new UpDownException();
		}
		return n;
	}
	public void play() {
		while(true) {
			try{int n = challenge();
			if(n<answer) {
				System.out.println("UP!");
			}else if(n>answer) {
				System.out.println("DOWN!");
			}else {
				System.out.println("정답!" + answer + "을 맞췄습니다. 걸린횟수 :" + count);
				return;
			}
			
			
			}catch(UpDownException e) {
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				sc.hasNext();//입력받는변수는 없어도됩니다
				System.out.println(e.getMessage());
				
			}
			return;
			
		}
	}
}
