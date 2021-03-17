package ex03_has_a;

public class Circle extends Coord{
	//field
	private double radius;
	
	//method
	
	public void setCircle(int x, int y, double radius) {
		//coord클래스의 set()메소드는 x,y좌표값을 저장하는 ㅔ소드입니다.
		//circle클래스는 coord 클래스를 상속받았기 때문에 .
		//coord클래스의 모든 메소드를 자신의 것처럼 사용 할 수 있다.
		set(x, y); //coord클래스의 set 메소드를 자신의 것처럼 호출합니다.
		this.radius = radius;
	}
	public void circleInfo() {
		System.out.print("중심좌표 : ");
		info();//coord클래스의 메소드호출
		System.out.println("반지름 : " + radius);
	}

}
