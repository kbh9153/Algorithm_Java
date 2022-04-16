package algorithm01;

import java.util.Scanner;

public class ADivisionB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double A = scanner.nextInt();
		double B = scanner.nextInt();

		if (0 < A && 10 > A && 0 < B && 10 > B) {
			System.out.println(A / B);
		}

		scanner.close();

	}

}
