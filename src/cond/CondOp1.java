package cond;

/**
 * Cond Op 1
 *
 * 삼항 연산자
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class CondOp1 {

	public static void main(String[] args) {

		// if문을 사용할 때 다음과 같이 단순히 참과 거짓에 따라 특정 값을 구하는 경우가 있다.

		int age = 18;
		String status;
		if (age >= 18) {
			status = "성인";
		} else {
			status = "미성년자";
		}
		System.out.println("age = " + age + " status = " + status);

		// 참과 거짓에 따라 status 변수의 값이 달라진다.
	}
}