package 콜렉션응용_개념;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 콜렉션종류_기본이론9_맵정렬 {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "apple");
		map.put(3, "mango");
		map.put(4, "grape");
		map.put(2, "orange");
		map.put(5, "melon");
		
		Object[] mapKey = map.keySet().toArray();
		Arrays.sort(mapKey);
		
		for(Integer key : map.keySet()) {
			System.out.println(key +" : "+map.get(key));
		}
	}
}
