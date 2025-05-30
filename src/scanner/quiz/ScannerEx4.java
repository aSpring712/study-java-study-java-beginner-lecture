package scanner.quiz;

import java.util.Scanner;

/**
 * Scanner Ex 4
 *
 * Q. 구구단 출력
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-26
 * @version 1.0
 */
public class ScannerEx4 {

	/*
	* 문제 - 구구단 출력
	* 사용자로부터 하나의 정수 n을 입력받고, 입력받은 정수 n의 구구단을 출력하는 프로그램을 작성하세요.
	* */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("구구단의 단 수를 입력해주세요: ");
		int n = input.nextInt();

		System.out.println(n + "단의 구구단: ");
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}
}