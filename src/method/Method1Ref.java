package method;

/**
 * Method 1 Ref
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class Method1Ref {

	public static void main(String[] args) {
		int sum1 = add(5, 10);
		System.out.println("결과1 출력: " + sum1);

		int sum2 = add(15, 20);
		System.out.println("결과2 출력: " + sum2);
	}

	// add 메서드
	public static int add(int a, int b) {
		System.out.println(a + " + " + b + " 연산 수행");
		int sum = a + b;
		return sum;
	}

	// 중복이 제거되고, 코드가 상당히 깔끔해진 것을 느낄 수 있다.
}