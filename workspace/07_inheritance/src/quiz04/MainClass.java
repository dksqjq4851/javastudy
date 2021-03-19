package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Fighter fighter1 = new KoreanFighter("양기정"); //에너지, 공격력 랜덤 생성
		Fighter fighter2 = new GlobalFighter("hans"); //에너지, 공격ㄺ 랜덤 생성
		fighter1.info();
		fighter2.info();
		System.out.println("FIGHT START!");
		
		boolean myTurn = (Math.random() < 0.5);
		
		do {
			if(myTurn) {
				fighter1.attack(fighter2);//fighter1의 공격
				myTurn = false;
			}else {
				fighter2.attack(fighter1);
				myTurn = true;//fighter2의 공ㄱㄱ
			}
			
		}while(fighter1.isAlive() && fighter2.isAlive());
		System.out.println("FIGHT OVER!");
		if(fighter1.isAlive()) {
			System.out.println(fighter1.getName() + " VICTORY!" + "남은 에너지 : " + fighter1.getEnergy());
			
		}else {
			System.out.println(fighter2.getName() + " VICTORY!" + "남은 에너지 : " + fighter2.getEnergy());
		}

	}

}
