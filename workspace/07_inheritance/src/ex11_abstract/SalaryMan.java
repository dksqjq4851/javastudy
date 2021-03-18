package ex11_abstract;

//추상클래스를 상속 받는서브 클래스들은 반드시 모든 추상메소드를 오버라이드 해야합니다.

public class SalaryMan extends Staff{
	//field
	private int salary;
	//constructor
	public SalaryMan(String name,int salary) {
		super(name);
		this.salary = salary;
	}
	//method
	@Override
	public void info() {
		super.info();
		System.out.println("기본급 : " + salary);
	}
	//필수
	@Override
	public int getPay() {
		return salary;
	}
	

}
