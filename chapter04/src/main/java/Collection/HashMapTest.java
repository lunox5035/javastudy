package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();

		String ks1 = "one";
		m.put("ks1", 1);

//		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);

		int i = m.get("one");
		int j = m.get(new String("two"));
		System.out.println(i + ":" + j);

		m.put("three", 33333);
		System.err.println(m.get("three"));

		// 순회
		Set<String> s = m.keySet();
		for (String key : s) {
			System.out.println(m.get(key));

		}

	}

}
