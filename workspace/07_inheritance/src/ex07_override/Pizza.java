package ex07_override;

public class Pizza {
	//field
	private String dough;
	private int cheese;
	//constructor
	public Pizza(String dough, int cheese) {
		//super();
		this.dough = dough;
		this.cheese = cheese;
	}
	
	//method
	
	public void info() {
		System.out.println(dough + "(" + cheese + ")");
	}
	

}
