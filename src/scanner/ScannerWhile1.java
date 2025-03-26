package scanner;

import java.util.Scanner;

/**
 * Scanner While 1
 *
 * Scanner - 반복 예제
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-26
 * @version 1.0
 */
public class ScannerWhile1 {

	/*
	* 지금까지 개발한 프로그램들은 단 한 번의 결과 출력 후 종료되는 일회성 프로그램이었다.
	* 실제 프로그램들은 이렇게 한 번의 결과만 출력하고 종료되지 않는다. 한 번 실행하면 사용자가 프로그램을 종료할 때 까지 반복해서 실행된다.
	* 이제부터는 사용자의 입력을 지속해서 받아들이고, 반복해서 동작하는 프로그램을 개발해보자.
	*
	* Scanner와 반복문을 함께 사용하면 된다.
	* */

	public static void main(String[] args) {

		/*
		* Scanner 반복 예제 1
		* - 사용자가 입력한 문자열을 그대로 출력하는 예제를 만들어보자.
		* - exit라는 문자가 입력되는 프로그램을 종료한다.
		* - 프로그램은 반복해서 실행된다.
		* */

		Scanner scanner = new Scanner(System.in);

		while (true) { // 중간에 break문을 만나기 전까지 무한 반복한다.

			System.out.print("문자열을 입력하세요(exit: 종료): ");
			String str = scanner.nextLine();

			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.println("입력한 문자열: " + str);
		}
	}
}