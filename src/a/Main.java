package a;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
	

	public static void main(String[] args) {
		String raw = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
		
		String abcdef = "abcdefghijklmnopqrstuvwxyz.'() ";
		String cdefgh = "cdefghijklmnopqrstuvwxyzab.'() ";
				
		// Mapeando `abcdef` para `cdefgh`
		Map<Character, Character> map = IntStream
				.range(0, abcdef.length())
				.boxed() // Transforma um `IntStream` para um `Stream<Integer>`
				.collect(Collectors.toMap(
						keyIndex -> abcdef.charAt(keyIndex),
						valueIndex -> cdefgh.charAt(valueIndex)
				));
		
		StringBuilder sb = new StringBuilder();
		for (int index = 0; index < raw.length(); index++) {
			sb.append(map.get(raw.charAt(index)) + "");
		}

		System.out.println(sb);
		
		sb.delete(0, raw.length()); // Reaproveitando o StringBuilder
		
		String url = "map";
		
		for (int index = 0; index < url.length(); index++) {
			sb.append(map.get(url.charAt(index)) + "");
		}
		
		System.out.println(sb);
	}
	
}
