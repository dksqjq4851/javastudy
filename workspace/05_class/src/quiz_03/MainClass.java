package quiz_03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.set("james", 50, 60, 70); //인수 : 이름, 국어, 영어, 수학

		System.out.println("평균:" + s.getAverage() );
		System.out.println(s.getPass());//60 이상"합격"미만은"불합격"
	}

}
