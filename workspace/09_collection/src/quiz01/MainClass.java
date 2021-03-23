package quiz01;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//문제
//임의의 Member를 3명 지정하고
//사용자로부터 회원 번호를 입력 받아서 해당 회원의 삭제를 진행하시오.
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		
		Scanner sc = new Scanner(System.in);
		
		
		
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		m1.setMDate(date);
		m1.setMId("elice");
		m1.setMNo(1111);
		
		m2.setMDate(date);
		m2.setMId("hans");
		m2.setMNo(2222);
		
		m3.setMDate(date);
		m3.setMId("jo");
		m3.setMNo(3333);
		List<Member> members = new ArrayList<Member>();
		members.add(m1);
		members.add(m2);
		members.add(m3);

		System.out.println("삭제할 회원번호를 입력하세요 >>>");
		int no = sc.nextInt();
		
		int removeIdx = -1;
		int length = members.size();
		for(int i = 0;i<length;i++) {
			if(members.get(i).getMNo() == no){
				removeIdx = i;
				break;
			}
		
		
		
	}
		if(removeIdx == -1) {
			System.out.println(no + " 회원 번호를 가진 회원이 없습니다.");
		}else {
			members.remove(removeIdx);
			System.out.println(no + "회원 번호를 가진 회원 정보를 삭제했습니다.");
		}

		//member클래스는 tostring() 메소드가 오버라이드 되어 있으므로
		//system.out.println(m1) 처럼 출ㄺ이 가능합니다.
	
	System.out.println(members);
	
	}
	
	

}
