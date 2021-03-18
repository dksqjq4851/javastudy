package ex09_upcasting;

public class Espresson extends Coffee{
	//field
	private int water;
	//construcor

	public Espresson(String bean, int water) {
		super(bean);
		this.water = water;
	}
	//method
	@Override
	public void info() {
		super.info();//커피의 인포
		System.out.println("물 양 : " + water + "ml");
	}
	@Override
	public void taste() {
		System.out.println("에스페레소 넘 짠행~");
	}

}
