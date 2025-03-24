package operator;

/**
 * Logical2
 *
 * 논리 연산자 활용
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-24
 * @version 1.0
 */
public class Logical2 {

	public static void main(String[] args) {

		int a = 15;
		// a는 10보다 크고 20보다 작다
//		boolean result = a > 10 && a < 20; // (a > 10) && (a < 20)
		// 더 읽기 좋게 작성
		boolean result = 10 < a && a < 20;
		System.out.println("result = " + result);
	}
}