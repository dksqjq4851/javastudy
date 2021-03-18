package quiz03;

public class SalaryMan extends Staff {
	//filed
	private int salary;

	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	//constructor
	//method
	public int getPay() {
		return salary;
	}
	@Override
	public void info() {
		super.info();//staff의 인포 -> 이름출력
		System.out.println("기본급 : " + getPay());
	}

}
