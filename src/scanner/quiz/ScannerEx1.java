package scanner.quiz;

import java.util.Scanner;

/**
 * Scanner Ex 1
 *
 * Q. 이름 나이 입력받고 출력하기
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-26
 * @version 1.0
 */
public class ScannerEx1 {

	/*
	* 문제 - 이름 나이 입력받고 출력하기
	* 사용자로부터 입력받은 이름과 나이를 출력하세요. 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다." 이어야 합니다.
	*
	* 실행 결과 예시
	* 당신의 이름을 입력하세요: 자바
	* 당신의 나이를 입력하세요: 30
	* 당신의 이름은 자바이고, 나이는 30살입니다.
	* */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("당신의 이름을 입력하세요: ");
		String name = scanner.nextLine(); // 이름을 입력받는다.

		System.out.print("당신의 나이를 입력하세요: ");
		int age = scanner.nextInt(); // 나이를 입력받는다. 나이는 정수이므로 nextInt()를 사용한다.

		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
	}
}