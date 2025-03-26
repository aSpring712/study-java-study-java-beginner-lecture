package scanner;

import java.util.Scanner;

/**
 * Scanner3
 *
 * Scanner 예제 3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-26
 * @version 1.0
 */
public class Scanner3 {

	public static void main(String[] args) {
		/*
		* 사용자로부터 두 개의 정수를 입력 받고, 더 큰 수를 출력하는 프로그램을 작성해보자.
		* 두 숫자가 같은 경우 두 숫자는 같다고 출력하면 된다.
		* 조건문을 사용해서 처리할 수 있다.
		* */

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자: ");
		int num1 = scanner.nextInt();

		System.out.print("두 번째 숫자: ");
		int num2 = scanner.nextInt();

		if (num1 > num2) {
			System.out.println("더 큰 숫자: " + num1);
		} else if (num2 > num1) {
			System.out.println("더 큰 숫자: " + num2);
		} else {
			System.out.println("두 숫자는 같습니다.");
		}
	}
}