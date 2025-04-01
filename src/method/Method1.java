package method;

/**
 * Method 1
 *
 * 메서드 시작
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class Method1 {

	/*
	* 두 숫자를 입력 받아서 더하고 출력하는 단순한 기능을 개발해보자.
	* 먼저 1 + 2를 수행하고, 그 다음으로 10 + 20을 수행할 것이다.
	* */

	public static void main(String[] args) {

		// 계산 1
		int a = 1;
		int b = 2;
		System.out.println(a + " + " + b + " 연산 수행");
		int sum1 = a + b;
		System.out.println("결과1 출력: " + sum1);

		// 계산 2
		int x = 10;
		int y = 20;
		System.out.println(x + " + " + y + " 연산 수행");
		int sum2 = x + y;
		System.out.println("결과2 출력: " + sum2);
	}
}