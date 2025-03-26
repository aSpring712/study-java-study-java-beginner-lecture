package scanner;

import java.util.Scanner;

/**
 * Scanner2
 *
 * Scanner - 기본 예제
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-26
 * @version 1.0
 */
public class Scanner2 {

	public static void main(String[] args) {
		/*
		* Scanner를 활용하는 간단한 예제를 만들어보자.
		* 두 수를 입력받고 그 합을 출력하는 예제이다.
		* */

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		System.out.print("두 번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();

		int sum = num1 + num2;
		System.out.println("두 숫자의 합: " + sum);
	}
}