package inputoutputandarithmeticoperations;

import java.util.Scanner;

public class BuddhismYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int y = scanner.nextInt();

		if (1000 <= y && y <= 3000) {
			System.out.println(y - 543);
		}

		scanner.close();

	}

}
