package ex01_method;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		
		p.set("hans", 25, '남', false, 186.5, 87.4); // 인수가 4개


		p.info();//인수가 0개 
		double bmi = p.getBMI();
		System.out.println(bmi);
	
		
	}

}
