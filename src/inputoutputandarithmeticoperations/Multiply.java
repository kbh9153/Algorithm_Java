package inputoutputandarithmeticoperations;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = b;

		while (temp != 0) {
			System.out.println(a * (temp % 10));
			temp /= 10;
		}
		System.out.print(a * b);

		sc.close();
	}

}
