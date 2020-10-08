package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Contando caracteres duplicados
public class Challenge_1  {

	public static void main(String[] args) {
	
		// Entrada
		String string = "adsjfdsfsfjsdjfhacabcsbajda";
		
		Map<Character, Integer> map = new HashMap<>();
		
		// Para cada caracter da string
		for (char letra : string.toCharArray()) {
			Optional.ofNullable(map.get(letra))
					.ifPresentOrElse(
							currentValue -> map.put(letra, currentValue + 1), // `ifPresent` currentValue + 1
							() -> map.put(letra, 1)); // `OrElse` value = 1
		}
		
		// Exibe o Map
		map.entrySet().forEach(System.out::println);
	
	}
		
	
	
	
}