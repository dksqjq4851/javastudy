package ex03_has_a;

public class Circle extends Coord{
	//field
	private double radius;
	
	//method
	
	public void setCircle(int x, int y, double radius) {
		//coordŬ������ set()�޼ҵ�� x,y��ǥ���� �����ϴ� �ļҵ��Դϴ�.
		//circleŬ������ coord Ŭ������ ��ӹ޾ұ� ������ .
		//coordŬ������ ��� �޼ҵ带 �ڽ��� ��ó�� ��� �� �� �ִ�.
		set(x, y); //coordŬ������ set �޼ҵ带 �ڽ��� ��ó�� ȣ���մϴ�.
		this.radius = radius;
	}
	public void circleInfo() {
		System.out.print("�߽���ǥ : ");
		info();//coordŬ������ �޼ҵ�ȣ��
		System.out.println("������ : " + radius);
	}

}
