package loop;

/**
 * Break1
 *
 * while문과 break
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Break1 {

	/*
	* Q. 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?
	* 1 + 2 + 3 .. 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
	* */

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

		while (true) { // 조건식이 항상 참이기 때문에 while문은 무한 반복된다.

			sum += i;
			if (sum > 10) { // sum > 10 조건을 만족하면 결과를 출력하고, break를 사용해서 while문을 빠져나간다.
				System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
				break;
			}
			i++;
		}
	}
}