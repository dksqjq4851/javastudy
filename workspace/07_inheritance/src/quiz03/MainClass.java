package quiz03;

public class MainClass {

	public static void main(String[] args) {

		//워급쟁이
		SalaryMan staff1 = new SalaryMan("james" ,300);
		SalaryMan staff4 = new SalaryMan("ames" ,300);
	
		//판매직
		SalesMan staff2 = new SalesMan("alice",100);
		staff2.setSalesAmount(2000);
	
		//알바
		Alba staff3 = new Alba("david");
		staff3.setPayPerHour(1);
		staff3.setTimes(200);
	
		
		Company company = new Company(10);
		company.hierStaff(staff1);
		company.hierStaff(staff2);
		company.hierStaff(staff3);
		company.hierStaff(staff4);
		company.staffInfo();
	}

}
