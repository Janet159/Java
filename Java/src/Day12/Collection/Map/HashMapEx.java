package Day12.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		//요소 추가
		map.put("혜원", 100);
		map.put("설윤", 90);
		map.put("릴리", 80);
		map.put("지우", 60);
		map.put("지니", 95);
		map.put("규진", 85);
		map.put("배이", 55);
		map.put("조은", 55);
		
		//기존에 있는 key "혜원"을 중복해서 추가
		// * 중복해서 key를 추가하면, 마지막에 추가한 값으로 지정된다.
		map.put("혜원", 99);
		
		System.out.println("총 개수: " + map.size());
		System.out.println();
		
		System.out.println("혜원의 코딩 성적: " + map.get("혜원"));
		System.out.println("설윤의 코딩 성적: " + map.get("설윤"));
		
		//요소 제거
		map.remove("조은");
		
		//Map 반복 1
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : "+ value);
		}
		//Map 반복 2 - Iterator 사용
		//map.entrySet()
		//entrySet.iterator()
		//* Entry: 키와 값(key, value)를 한 쌍으로 저장한 자료구조
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" : "+ value);
		}
		System.out.println();
		
		// Map 반복 3 -formap
		// formap: ctrl + space
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+ " : "+ val);
			
		}
		System.out.println();
		
		System.out.println("총 개수: " + map.size());
		map.clear();
		System.out.println("empty 여부: " + map.isEmpty());
	}
}
