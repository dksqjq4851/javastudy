package ex17_object.quiz;

public class MainClass {

	public static void main(String[] args) {
		Score score1 = new Score();
		Score score2 = new Score(70, 80, 90);//국어 70 영어80 수학 90
		
		score1.setKor(70);
		score1.setEng(80);
		score1.setMat(90);
		
		System.out.println(score1);
		System.out.println(score2);
		
		if(score1.equals(score2)) {
			System.out.println("성적이 같습니다.");
		}else {
			System.out.println("성적이 다릅니다.");
		}

	}

}
