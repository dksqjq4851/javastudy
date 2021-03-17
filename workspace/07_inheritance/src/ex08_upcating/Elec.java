package ex08_upcating;

public class Elec {
	private int watt;
	//constructor

	public Elec(int watt) {
		super();
		this.watt = watt;
	}
	//method
	public void info() {
		System.out.println("소비 전력 : " + watt + "w");
	}

}
