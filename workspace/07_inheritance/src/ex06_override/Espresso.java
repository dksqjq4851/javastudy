package ex06_override;

public class Espresso extends Coffee {
	//field
	private int water;
	//constructor

	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	@Override
	public void taste() {
		System.out.println("���������Ҵ� ���������� ���ϴ�.");
	}
	
	//method
	//expresso Ŭ������ �̹� coffee Ŭ������ �޼ҵ带 ����Ҽ��ֽ��ϴ�.
	//expresso Ŭ������ coffee Ŭ������ taste()�޼ҵ餩 ����ϴ°��� �����ұ��?
	// no1 espresso Ŭ������ �ڽô� ���� ǥ���ϱ� ���ؼ� ���Ӱ� taste()�޼ҵ带 ����°��� �����ϴ�.
	
	//�޼ҵ� �������̵�
	//����Ŭ������ �޼ҵ带 ������� �ʱ� ���ؼ�,
	// ���� Ŭ������ �޼ҵ带 �ٽ� ����� ���� �ǹ��մϴ�.
	//����ܾ� : �����ε��� �������̵�� ���� �ٸ��Ƿ� ����

	//�������̵� ������
	//1. �Ȱ������·� ����ϴ�. �Ȱ��� ������ �������̵尡 �дϴ�.
	//2. @override �ֳ����̼� �� �ۼ��� �ݴϴ�.
		//1) �����ڰ� ���ٿ��� �� �޼ҵ�� �������̵� �ϴ� ���̶�� �˸��� ���Դϴ�.
	//2) �׷��� �ڹٴ� �������̵� ��Ģ�� ����� ��� ������ �߻����� �ݴϴ�.
	
}
