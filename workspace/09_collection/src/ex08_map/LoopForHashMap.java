package ex08_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class LoopForHashMap {

	public static void main(String[] args) {
		
		Map<String, String> me = new HashMap<String, String>();
		me.put("name", "민경태");
		me.put("age", 44 + "");
		me.put("phone", "010-4545-9632");
		
		//1. 향상 for문은 key만 뱁니다.
		//me에서 key만 빼는 메소드 : keySet()
		
		Set<String> keys = me.keySet();
		for(String key : keys) {
			System.out.println(me.get(key));
		}
		
		//2.iterator 인터페이스
		
		Iterator <String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			String value = me.get(key);
			System.out.println(key + " m " + value);
		}
		
		//3.데이터 쌍으로 뺄 수 있습니다.
		//entry : key와 value를 묶어서 entry라고 합니다.
		// key : getKey() 
		//value : getValue()
		Set<Map.Entry<String, String>> entrys = me.entrySet();
		
		//1)for
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "," + value);
			
		}
		//2)iterator
		Iterator<Map.Entry<String, String>> itr2 = entrys.iterator();
		while(itr2.hasNext()) {
			Map.Entry<String, String> entry = itr2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "," + value);
		}
	}

}
