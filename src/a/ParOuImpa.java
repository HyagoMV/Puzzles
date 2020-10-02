package a;

/*
 * Se o bit menos significativo for 0 o número é PAR
 * Se o bit menos significativo for 1 o número é ÍMPAR
 */
public class ParOuImpa {

	public static void main(String[] args) {
		soluction_1_0(2);
		soluction_1_0(3);

		soluction_1_1(2);
		soluction_1_1(3);

		soluction_1_2(2);
		soluction_1_2(3);

		soluction_2_0(2);
		soluction_2_0(3);

		soluction_2_1(2);
		soluction_2_1(3);

		soluction_2_2(2);
		soluction_2_2(3);

		soluction_4_0(2);
		soluction_4_0(3);
		
		soluction_4_1(2);
		soluction_4_1(3);
		
		soluction_4_2(2);
		soluction_4_2(3);
	}

	private static void soluction_1_0(int num) {
		switch (num << 31) {
		case 0:
			System.out.println("PAR");
			break;

		default:
			System.out.println("ÍMPAR");
			break;
		}
	}

	private static void soluction_1_1(int num) {
		if (num << 31 == 0)
			System.out.println("PAR");
		else
			System.out.println("ÍMPAR");

	}

	private static void soluction_1_2(int num) {
		System.out.println(num << 31 == 0 ? "PAR" : "ÍMPAR");

	}

	private static void soluction_2_0(int num) {
		switch (num % 2) {
		case 0:
			System.out.println("PAR");
			break;
		default:
			System.out.println("ÍMPAR");
			break;
		}
	}

	private static void soluction_2_1(int num) {
		if (num % 2 == 0)
			System.out.println("PAR");
		else
			System.out.println("ÍMPAR");
	}

	private static void soluction_2_2(int num) {
		System.out.println(num % 2 == 0 ? "PAR" : "ÍMPAR");
	}

	private static void soluction_4_0(int num) {
		switch (num & 0b1) {
		case 0:
			System.out.println("PAR");
			break;

		default:
			System.out.println("ÍMPAR");
			break;
		}
	}

	private static void soluction_4_1(int num) {
		if ((num & 0b1) != 1)
			System.out.println("PAR");
		else
			System.out.println("ÍMPAR");
	}
	
	private static void soluction_4_2(int num) {
		System.out.println((num & 0b1) != 1 ? "PAR" : "ÍMPAR");
	}
}
