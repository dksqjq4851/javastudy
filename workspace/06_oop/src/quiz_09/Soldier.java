package quiz_09;

public class Soldier {
	//field
	private String name;
	private Gun[] guns;
	private int idx;
	
	//constructor
	public Soldier(String name, int gunCount) {
		this.name = name;
		guns = new Gun[gunCount];
	}
	
	
	//method
	
	public void addGun(Gun gun) {
		if(idx<guns.length) {
			guns[idx++] = gun;
		}else {
			System.out.println("최대 보유 가능 개수를 넘었습니다.");
		}
		
		
		
	}
	public void shoot() {
		for(int i = 0;i<idx;i++) {
			if(guns[i]!= null) {
				guns[i].shoot();
			}
		}
		
	}
	public void shoot(int gunNo) {
		guns[gunNo - 1].shoot();
		
	}
	public void shoot(String model) {
		for(int i = 0; i<idx;i++) {
			if(guns[i].getModel().equals(model)) {
				guns[i].shoot();
			}
		}
	}
	public void reload(int bullet) {
		for(Gun gun : guns) {
			if(gun != null) {
				gun.reload(bullet);
			}
		}
	}
	public void reload(int gunNo, int bullet) {
		guns[gunNo-1].reload(bullet);
	}
	public void reload(String model, int bullet) {
		for(Gun gun : guns) {
			if(gun != null && gun.getModel().equals(model)) {
				gun.reload(bullet);
			}
		}
	}
	public void info() {
		System.out.println("이름 : " + name);
		for(int i = 0;i<idx;i++) {
			guns[i].info();
		}
		
	}
	

}
