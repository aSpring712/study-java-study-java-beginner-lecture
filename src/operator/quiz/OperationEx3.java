package operator.quiz;

/**
 * OperationEx3
 *
 * 합격 범위
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-24
 * @version 1.0
 */
public class OperationEx3 {

	public static void main(String[] args) {

		/*
		* int형 변수 score를 선언하세요.
		* score가 80점 이상이고, 100점 이하이면 true를 출력하고, 아니면 false를 출력하세요.
		* */

		int score = 80;
		boolean result = 80 <= score && score <= 100;
		System.out.println(result);
	}
}