package ex01_is_a;

//student�� eat()�� ����ϰ����մϴ�.��
/*
 	���(inheritance)
 	1. � Ŭ������ �ٸ� ũ������ ����� Ȯ���ϴ°��� �ǹ��մϴ�
 	2. ����� ������ ��ǥ���� Ŭ�������� ����� is-a �����Դϴ�.
 	3. IS-A
 		Person is a Student.
 		Student is a perason. -> is-a �Ȥ��� ����
 	4. Student �� Person �� ���������� �� �̤����ϴ�.
 	
 	
 	����Ŭ������ ����Ŭ����
 	1.����Ŭ���� : �θ�Ŭ������� �����ϴ�.��
 	2.����Ŭ���� : �ڽ�Ŭ��������մϴ�. �ٸ�Ķ������ �޼ҵ带 �����޴� ũ�����Ԥ�'
 	3.����
 		class ����ũ����{}
 		class ����Ķ���� extends ����Ŭ����{}
 
 
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.eat();
		
		Student s = new Student();
		s.study();
		s.eat();

	}

}
