package ex06_override;

public class Coffee {
	
	//field
	private String bean; //����
	
	//constructor
	public Coffee(String bean) {
		this.bean= bean;
	}
	//method
	public void taste() {
		System.out.println(bean + "������ ���δ� ���� �����ϴ�.");
	}

}
