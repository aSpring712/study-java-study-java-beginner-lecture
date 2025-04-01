package method.quiz;

/**
 * Method Ex 2
 *
 * 문제 - 반복 출력 리펙토링
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodEx2 {

	// 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다. 메서드를 사용해서 리펙토링 해보자.

//	public static void main(String[] args) {
//
//		String message = "Hello, world!";
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println(message);
//		}
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println(message);
//		}
//
//		for (int i = 0; i < 7; i++) {
//			System.out.println(message);
//		}
//	}

	public static void main(String[] args) {

		String message = "Hello, world!";

		printMessage(message, 3);
		printMessage(message, 5);
		printMessage(message, 7);
	}

	public static void printMessage(String message, int times) {

		for (int i = 0; i < times; i++) {
			System.out.println(message);
		}
	}
}