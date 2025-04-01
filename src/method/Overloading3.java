package method;

/**
 * Overloading 3
 *
 * 매개변수의 타입이 다른 오버로딩 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class Overloading3 {

	public static void main(String[] args) {

		System.out.println("1: " + add(1, 2)); // add(int a, int b) 호출
		System.out.println("2: " + add(1.2, 1.5)); // add(double a, double b) 호출
	}

	// 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
	// -> 첫 번째 메서드를 제거하면 -> 1: add(1, 2) 호출 시 -> 자동 형변환 -> add(double a, double b)가 호출된다
	public static int add(int a, int b) {
		System.out.println("1번 호출");
		return a + b;
	}

	// 두 번째 add 메서드: 두 실수를 받아서 합을 반환한다.
	// 첫 번째 메서드와 이름은 같지만, 매개변수의 유형이 다르다.
	public static double add(double a, double b) {
		System.out.println("2번 호출");
		return a + b;
	}
}