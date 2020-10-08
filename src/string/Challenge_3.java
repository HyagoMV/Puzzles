package string;

public class Challenge_3 {

	public static void main(String[] args) {
		String string = "I evol uoy os !hcum";

		String[] split = string.split(" ");

		for (String pedaço : split) {
			for (int i = pedaço.length() - 1; i > -1; i--) {
				System.out.print(pedaço.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
