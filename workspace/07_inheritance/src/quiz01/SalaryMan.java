package quiz01;

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

}
