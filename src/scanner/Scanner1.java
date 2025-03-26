package scanner;

import java.util.Scanner;

/**
 * Scanner1
 *
 * Scanner 학습
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Scanner1 {

	public static void main(String[] args) {

		// Scanner scanner -> scanner 변수 선언
		Scanner scanner = new Scanner(System.in); // Scanner는 System.in을 사용해서 사용자의 입력을 편리하게 받도록 도와준다.

		System.out.print("문자열을 입력하세요: ");
		// scanner.nextLine() -> 엔터(\n)를 입력할 때까지 문자를 가져온다.
		String str = scanner.nextLine(); // 입력을 String으로 가져옵니다.
		System.out.println("입력한 문자열: " + str);

		System.out.print("정수를 입력하세요: ");
		int intValue = scanner.nextInt(); // 입력을 int로 가져옵니다. -> 정수 입력에 사용한다.
		System.out.println("입력한 정수: " + intValue);

		System.out.print("실수를 입력하세요: ");
		double doubleValue = scanner.nextDouble(); // 입력을 double로 가져옵니다. -> 실수 입력에 사용한다.
		System.out.println("입력한 실수: " + doubleValue);

		/*
		* 주의! - 다른 타입 입력시 오류
		* 타입이 다르면 오류가 발생한다. 예제와 같이 숫자에 문자를 입력하면 오류가 발생한다.
		*
		* 정수를 입력하세요: 백만원
		* Exception in thread "main" java.util.InputMismatchException
		* at java.base/java.util.Scanner.throwFor(Scanner.java:939)
		* at java.base/java.util.Scanner.next(Scanner.java:1594)
		* at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
		* at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
		* at scanner.Scanner1.main(Scanner1.java:15)
		* */
	}
}