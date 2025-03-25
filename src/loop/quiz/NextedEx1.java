package loop.quiz;

/**
 * Nexted Ex 1
 *
 * Q. 구구단 출력
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class NextedEx1 {

	public static void main(String[] args) {

		// 중첩 for문을 사용해서 구구단을 완성해라.
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}