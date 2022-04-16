package algorithm01;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (0 < A && 10000 > A && 0 < B && 10000 > B) {
			System.out.println(A + B);
			System.out.println(A - B);
			System.out.println(A * B);
			System.out.println(A / B);
			System.out.println(A % B);
		}

	}

}
