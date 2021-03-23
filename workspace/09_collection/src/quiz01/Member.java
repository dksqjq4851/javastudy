package quiz01;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Member {
	//field
	private int mNo; // 회원 번호
	private String mId; //회원아이디
	private Date mDate;//회원가입일
	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mDate=" + mDate + "]";
	}
	
	//lombox을 활용한 getter, setter, constructor 자동생성
	
	//object클래스의 tostrin()을 오버라이드

}
