package ex09_hash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	//field
	private int bNo;
	private String title;
	private String writer;
	@Override
	public String toString() {
		return "[bNo=" + bNo + ", title=" + title + ", writer=" + writer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (bNo != other.bNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}
}

	/*@Override
	public int hashCode() {
		
		//return title.length();//title의 글자수가 같으면 같은 board의 가능성이 있다!
		return title.length() + writer.length();
	}
}*/
	/*@Override
	public boolean equals(Object obj) {
		if(this == obj) {// boar1.equals(board1)
			return true;
		}
		if(obj instanceof Board) {
			Board board = (Board)obj;
			return this.bNo == board.bNo;
		}
		return false;
	}
}
*/

/*
	hashset에 board를 저장하고자합니다.
	동일한 board의 경우 저장이 안 되도록 설정해야 합니다.
	
	1. 자바의 기본 동작
		1)저장할 board의 해시코드를 확인합니다.(저장된 주소)
		2)같은 해시코드를 가지고 있는 board가 있습니가? 노우~
		3)따라서, 같은 board는 없다고 판단합니다.
		4)무조건 저장됩니다.
	2. 추가해야할작업
		1)같은 board는 같은 해시코드를 가질 수 있도록 hashcode()메소드를 오버라이드합니다.
		2)같은 board인지 비교할 수 있는 equals() 메소드를 오버라이드 합니다.
		3)같은 해시코드를 가지고, equals()결과가 트루이면 동일한 보드가 있다고판단하므로 저장되지않스니다.
		
		
		
	====최종결론=====
	hash 기반의 컬레션프레임워크(hashset, hashmap 등)에 저장할 객체들은
	모두 generate hashcode() and equals()를 추가해 줍니다.
*/