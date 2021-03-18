package ex08_upcasting;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv(200, "LO -75");
		tv.info();
		Elec elec = tv;
		
		elec.info();
		
		Elec elec2 = new Tv(300, "Samsung-85");
		elec2.info();
	}

}
