package ex07_override;

public class GogumaPizza extends Pizza {
	//field
	private String goguma;

	public GogumaPizza(String dough, int cheese, String goguma) {
		super(dough, cheese);
		this.goguma = goguma;
	}
	
	//constructor
	
	//method
	//���� ������ ����� ���ؼ� pizza�� info()�� �ٽ� ������ �մϴ�.
	@Override
	public void info() {
		System.out.println("������ : " + goguma);
		super.info();
	}

}
