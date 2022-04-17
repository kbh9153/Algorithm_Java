package inputoutputandarithmeticoperations;

import java.util.Scanner;

public class APlusB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (0 < A && 10 > A && 0 < B && 10 > B) {
			System.out.println(A + B);
		}

		scanner.close();

	}

}
