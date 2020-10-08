package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Challenge_2 {

	public static void main(String[] args) {
		String string = "cbcbdde";
		
		Map<Character, Integer> map = new HashMap<>();
		
		// Para cada caracter da string
		for (char letra : string.toCharArray()) {
			Optional.ofNullable(map.get(letra))
					.ifPresentOrElse(
							currentValue -> map.put(letra, currentValue + 1), // `ifPresent` currentValue + 1
							() -> map.put(letra, 1)); // `OrElse` value = 1
		}
		
		// Filtra e Exibe o Map
		map.entrySet()
			.stream()
			.filter(entry -> entry.getValue() == 1)
			.forEach(System.out::println);
	}

}
