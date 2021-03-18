package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Fighter fighter1 = new KoreanFighter("양기정"); //에너지, 공격력 랜덤 생성
		Fighter fighter2 = new GlobalFighter("hans"); //에너지, 공격ㄺ 랜덤 생성
		
		boolean myTurn = (Math.random() < 0.5);
		
		do {
			if(myTurn) {
				fighter1.attack(fighter2);//fighter1의 공격
			}else {
				fighter2.attack(fighter1);//fighter2의 공ㄱㄱ
			}
			
		}while(fighter1 과 fighter2가 모두 살아있으면)

	}

}
