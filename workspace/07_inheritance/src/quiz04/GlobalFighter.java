package quiz04;

public class GlobalFighter extends Fighter {
	//attack() : 10% 확률로 한방에 ko
	public GlobalFighter(String name) {
		super(name, (int)(Math.random()*100) + 1, (int)(Math.random()*10)+1);
		
		// TODO Auto-generated constructor stub
	}
	//attack method
	@Override
	public void attack(Fighter fighter) {
		if(Math.random()<0.1) {
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + "가 다운다운!");
		}else {
			fighter.setEnergy(fighter.getEnergy() - this.getPower());
			System.out.println("공격자 : "+ this.getName() + "이" +this.getPower() + "만큼 데미지를 주었습니다. 상대편의 체력이" + fighter.getEnergy() + "만큼 남았습니다.");
		}
		
	}
}
