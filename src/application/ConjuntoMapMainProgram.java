package application;

import java.util.Map;
import java.util.TreeMap;

public class ConjuntoMapMainProgram {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "999771122");
		
		cookies.remove("email");
		cookies.put("phone", "9 99771133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Número do telefone: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("TODOS OS COOKIES");
		for (String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
