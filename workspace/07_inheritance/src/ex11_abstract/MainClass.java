package ex11_abstract;

public class MainClass {

	public static void main(String[] args) {

		Staff staff = new SalaryMan("alice", 300);
		staff.info();
		
		//staff의 getPay()ㅡㄴ 어떻게 호출할 수 있나요?
		//1.staff 클래스에 getpay를 추가합니댜ㅏ.
		// 모든 스태프는 겟페이를 가져야 하므로 이 방법으로 해결합니다.
		//2. 샐러리맨 클래스로 캐스팅합니다.
		System.out.println(staff.getPay());
	}

}
