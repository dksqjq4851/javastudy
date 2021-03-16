package ex03_overloading;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//직사각형을 만들어 봅니다.
		Rectangle nemo1 = new Rectangle();
		nemo1.set(3, -2);
		System.out.println("넓이: " + nemo1.getArea());
		//정사각형을 만들어 봅니다.
		Rectangle nemo2 = new Rectangle();
		//nemo2.set(3,3));
		nemo2.set(6);
		System.out.println("넓이: " + nemo2.getArea());

		
	}

}
