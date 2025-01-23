package in.abhi;

import java.util.HashMap;
import java.util.Map;

public class Find_Occurrence_ofEach_Charater {
	public static void main(String[] args) {
		String str="hello";
		
		Map<Character, Integer> map=new HashMap<>();
		char[] chars = str.toCharArray();
		for(Character ch:chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				Integer cnt = map.get(ch);
				map.put(ch, cnt+1);
			}
		}
		System.out.println(map);
	}
}
