package loop.quiz;

/**
 * For Ex 1
 *
 * Q. 자연수 출력
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class ForEx1 {

	/*
	* Q. 자연수 출력
	* 처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, count라는 변수를 사용해야 합니다.
	* while문, for문 2가지 버전의 정답을 만들어야 합니다.
	*
	* 출력 예시:
	* 1
	* 2
	* ...
	* 10
	* */

	// for
	public static void main(String[] args) {

		for (int count = 1; count <= 10; count++) {
			System.out.println(count);
		}
	}
}