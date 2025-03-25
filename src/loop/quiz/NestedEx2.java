package loop.quiz;

/**
 * Nested Ex 2
 *
 * Q. 피라미드 출력
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class NestedEx2 {

	/*
	 * int rows를 선언해라.
	 * 이 수만큼 다음과 같은 피라미드를 출력하면 된다.
	 *
	 * 참고: println()은 출력 후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 print()를 사용하면 된다.
	 *
	 * 출력 형태
	 * // rows = 2
	 * *
	 * **
	 *
	 * // rows = 5
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * */

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}