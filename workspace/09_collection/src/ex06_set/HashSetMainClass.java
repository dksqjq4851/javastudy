package ex06_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet();
		
		set.add("java");
		set.add("java");
		set.add("jsp");
		set.add("jsp");
		set.add("spring");
		set.add("spring");
		System.out.println("요소 개수 ㅣ "+ set.size());

		for (String s : set) {
			System.out.println(s);
		}
	}

}
