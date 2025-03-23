package operator;

/**
 * Operator5
 *
 * 증감 연산자
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-23
 * @version 1.0
 */
public class OperatorAdd1 {

	public static void main(String[] args) {

		// 증감 연산자는 ++와 --로 표현되며, 이들은 변수의 값을 1만큼 증가시키거나 감소시킨다.

		int a = 0;

		a = a + 1;
		System.out.println("a = " + a); // a = 1
		a = a + 1;
		System.out.println("a = " + a); // a = 2

		// 증감 연산자
		++a; // a = a + 1
		System.out.println("a = " + a); // 3
		++a; // a = a + 1
		System.out.println("a = " + a); // 4
	}
}