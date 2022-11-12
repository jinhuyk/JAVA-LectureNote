package greenjoa.week10.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import greenjoa.week10.Set.Word;

public class TestMain {
	
	public static void main(String[] args) {
		HashMap<String,Word> map = new HashMap<>();
		map.put("red",new Word("red", "빨강"));
		map.put("red",new Word("red", "빨강"));
		map.put("red",new Word("red", "빨강"));
		map.put("red",new Word("red", "빨강"));
		
		Set<Entry<String, Word>> set = map.entrySet();
		Iterator<Entry<String, Word>> it = set.iterator();
		while(it.hasNext()) {
			Entry<String, Word> entry = it.next();
			String key = entry.getKey();
			Word value = entry.getValue();
			System.out.println(key+value);
		}
	}
}
