package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Hi", "How are you?");
		hm.put("Hey", "Whats up");
		hm.put("Hello", "Good Bye");
		hm.put("Hola", "Como Estas");

		System.out.println(hm.get("Hi"));
		hm.remove("Hola");
		System.out.println(hm.containsValue("Whats up"));
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println("----------------------");

		for (Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());


		}
		Iterator<Map.Entry<String, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());


		}

	}
}
