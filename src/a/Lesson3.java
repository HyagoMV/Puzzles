package a;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	
public class Lesson3 {
	
	static Scanner scanner; 
	
	public static void main(String[] args) throws Exception {
		scanner = new Scanner(Lesson3.class.getResource("/Lesson3.txt").openStream());
		solution_1();
		
		scanner = new Scanner(Lesson3.class.getResource("/Lesson3.txt").openStream());
		soluction_2();
		
		scanner.close();
	}

	static void soluction_2() {
		Map<Character, Integer> map = new LinkedHashMap<>();
		while (scanner.hasNext()) {
			char[] line = scanner.nextLine().toCharArray();
			for (char c : line) {
				if (!map.containsKey(c))
					map.put(c, 1);
				else
					map.put(c, map.get(c) + 1);
			}
		}

		map.forEach((key, value) -> {
			if (value == 1)
				System.out.print(key);
		});
	}
	
	static void solution_1() throws IOException {
		String s = "";
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			s += line.replaceAll("[^a-z]", "");
		}

		System.out.println(s);

	}

}

