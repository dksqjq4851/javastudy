package ex04_constructor;
//����Ŭ����(�ڽ� Ŭ����)
//����Ŭ������ �����ڴ� ����Ŭ������ �����ڸ� �ݵ�� ���� ȣ���ؾ� �մϴ�.
//������ ������ ���� ����Ŭ������ �����ڰ� "����Ʈ ������"�����϶� �����մϴ�.

//����Ŭ���� Ű����
//super : ����Ŭ������ ���� ��
//1. super.��� : super.�ʵ�, super.�޼ҵ�()
//2. super() : ���� Ŭ������ ������
public class Student extends Person{
	//field
	private String school;
	//constructor
	public Student(String name, String school) {
		super(name);
		this.school = school;
		
	}
	//method
	public void info() {
		System.out.println("�̸� : " + getName());
		System.out.println("�б�: " + school);
	}
	
	}
	


