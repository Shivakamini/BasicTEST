package com.CoreJavaScripts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "Shiva");
		map.put(1, "krishna");
		map.put(4, "ganesh");
		map.put(6, "baba");
		map.put(4, "Lord");

		System.out.println(map.isEmpty());
		System.out.println(map);

		map.put(2, "god");
		map.remove(1);
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.containsKey(4));

		Set s = map.entrySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
			System.out.print(m.getKey() + "-" + m.getValue() + "\t");
		}

	}

}
