package quiz03;

public class SalesMan extends SalaryMan {
	//field
	private int salesAmount;
	private double incentive;
	//constructor
	public SalesMan(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if(salesAmount >= 1000) {
			setIncentive(0.07);
		}else {
			setIncentive(0.05);
		}
	}

	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	@Override
	public int getPay() {
		return super.getPay() + getSalesPay();
	}
	public int getSalesPay() {
		return (int)(salesAmount * incentive);
	}
	@Override
	public void info() {
		super.info(); // 직원명, 기본급
		System.out.println("판매수당 : " + getSalesPay());
		System.out.println("총합 : " + getPay());
	}
 
}
