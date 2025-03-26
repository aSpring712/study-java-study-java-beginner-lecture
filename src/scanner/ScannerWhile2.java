package scanner;

import java.util.Scanner;

/**
 * Scanner While 2
 *
 * Scanner 반복 예제 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-26
 * @version 1.0
 */
public class ScannerWhile2 {

	/*
	* Scanner 반복 예제 2
	* - 첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발하자.
	* - 첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료한다.
	* - 프로그램은 반복해서 실행된다.
	* */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

		while (true) {

			System.out.print("첫 번째 숫자(0: 종료): ");
			int num1 = scanner.nextInt();

			System.out.print("두 번째 숫자(0: 종료): ");
			int num2 = scanner.nextInt();

			if (num1 == 0 && num2 == 0) { // 입력 받은 num1, num2 둘다 함께 0일 때 -> 비교 연산자 -> true && true -> true -> 두 조건이 모두 참이어야 if문의 코드 블럭이 실행된다.
				System.out.println("프로그램 종료"); // "프로그램 종료"를 출력하고
				break; // break를 통해 while문을 빠져나간다.
			}

			int sum = num1 + num2;
			System.out.println("두 숫자의 합: " + sum);
		}
	}
}