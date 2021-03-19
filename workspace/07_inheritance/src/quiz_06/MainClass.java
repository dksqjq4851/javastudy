package quiz_06;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bunker bunker = new Bunker();
		bunker.add(new Marine());
		bunker.add(new Firebat());
		// bunker.add(new Tank());  // 불가능
	}

}
