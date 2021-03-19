package quiz04;

public class KoreanFighter extends Fighter {

	public KoreanFighter(String name) {
		super(name, (int)(Math.random()*100) + 1, (int)(Math.random()*10)+1);
		
		// TODO Auto-generated constructor stub
	}
	
	//method
	//attack() : 20% 확률로 한방에 ko
	@Override
	public void attack(Fighter fighter) {
		//나 : this
		//상대편 : fighter
		if(Math.random()<0.2) {
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + "원펀치 쓰리 강냉이로 KO");
		}else {
			//내 파워 만큼 상대편 에너지가 줄어듭니다.
			fighter.setEnergy(fighter.getEnergy() - this.getPower());
			System.out.println("공격자 : "+ this.getName() + "이" +this.getPower() + "만큼 데미지를 주었습니다. 상대편의 체력이" + fighter.getEnergy() + "만큼 남았습니다.");
		}
	}
	//field
	//constructor

}
