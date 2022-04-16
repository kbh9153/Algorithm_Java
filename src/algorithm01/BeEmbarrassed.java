package algorithm01;

import java.util.Scanner;

public class BeEmbarrassed {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String A = scanner.next();

		if (A.length() <= 50) {
			System.out.println(A + "??!");
		}

		scanner.close();

	}

}
