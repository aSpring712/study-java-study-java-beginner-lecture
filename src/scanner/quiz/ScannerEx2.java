package scanner.quiz;

import java.util.Scanner;

/**
 * Scanner Ex 2
 *
 * Q. 홀수 짝수
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-26
 * @version 1.0
 */
public class ScannerEx2 {

	/*
	* 문제 - 홀수 짝수
	* 사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
	*
	* 실행 결과 예시 1
	* 하나의 정수를 입력하세요: 1
	* 입력한 숫자 1는 홀수입니다.
	*
	* 실행 결과 예시 2
	* 하나의 정수를 입력하세요: 4
	* 입력한 정수 4는 짝수입니다.
	* */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("하나의 정수를 입력하세요: ");
		int number = scanner.nextInt();

		//		String result = number % 2 == 0 ? "짝수" : "홀수";
//		System.out.println("입력한 정수 " + number + "은(는) " + result + "입니다.");

		if (number % 2 == 0) {
			System.out.println("입력한 정수 " + number + "은(는) 짝수입니다.");
		} else {
			System.out.println("입력한 정수 " + number + "은(는) 홀수입니다.");
		}
	}
}