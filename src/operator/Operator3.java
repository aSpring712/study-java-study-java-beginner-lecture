package operator;

/**
 * Operator3
 *
 * 연산자 우선순위 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-23
 * @version 1.0
 */
public class Operator3 {

	public static void main(String[] args) {

		// 수학에서와 마찬가지로 자바에서도 덧셈보다 곱셉이 우선순위가 더 높고, 연산자 우선순위를 변경하려면 수학과 마찬가지로 괄호()를 사용하면 된다.
		int sum1 = 1 + 2 * 3; // 1 + (2 * 3)과 같다.
		int sum2 = (1 + 2) * 3;
		System.out.println("sum1 = " + sum1); // sum1 = 7
		System.out.println("sum2 = " + sum2); // sum2 = 9
	}
}