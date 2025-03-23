package operator;

/**
 * Operator4
 *
 * 연산자 우선순위 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-23
 * @version 1.0
 */
public class Operator4 {

	public static void main(String[] args) {

		int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
		int sum4 = (2 * 2) + (3 * 3); // sum3과 같다. -> sum3과 같이 복잡한 경우 sum4와 같이 괄호를 명시적으로 사용하는 것이 더 명확하고 이해하기 쉽다.
		System.out.println("sum3 = " + sum3); // sum3 = 13
		System.out.println("sum4 = " + sum4); // sum4 = 13
	}
}