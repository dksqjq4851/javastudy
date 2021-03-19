package ex15_interface_extends;

public class SmartPhone extends Phone implements Computable {

	@Override
	public void playApp() {
		// TODO Auto-generated method stub
		System.out.println("앱을 실행합니다.");
		
	}
	//computale의 playapp()을 반드시 오버라이드 해야딥니다,.

}
