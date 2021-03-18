package quiz03;

public class Company {
	//field
	private Staff[] staffList;
	private int idx;
	
	//constructor
	public Company(int staffCount) {
		staffList = new Staff[staffCount];
	}
	
	//method
	public void hierStaff(Staff staff) {
		if(idx == staffList.length) {
			System.out.println("직원을 모두 고용했습니다.");
			return;
		}
		staffList[idx++] = staff;
	}

	public void staffInfo() {
		for (Staff staff : staffList) {
			if(staff != null) {
				staff.info();
			}
			
		}
		System.out.println("salayman의 총합 : " + getSalaryManTotalPay());
	}
	//SalaryMan 들에게 지급된 급여 총액을 구하고싶다
	public int getSalaryManTotalPay() {
		//staff[] stafflist; 이므로 저장된 객채들이 샐러리면이냐 아니냐를 검사해야합니다.
		int salaryManTotalPay = 0;
		for (Staff staff : staffList) {
			if(staff instanceof SalaryMan) {
				if(!(staff instanceof SalesMan)) {
				salaryManTotalPay += ((SalaryMan) staff).getPay();
			}
		}}
		return salaryManTotalPay;
	}
}
