package a;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson3 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(Lesson2.class.getResource("/Lesson3.txt").openStream());

		String s = "";
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			s += line.replaceAll("[^a-z]", "");
		}

		System.out.println(s);

	}

}