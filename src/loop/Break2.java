package loop;

/**
 * Break2
 *
 * for문과 break
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Break2 {

	/*
	* for문을 사용해서 다음 문제를 풀어보자.
	* Q. 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
	* 1 + 2 + 3 ... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
	* */

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

		for (;;) { // 조건식이 없다 -> for문은 조건이 없으면 무한 반복한다.

			sum = sum + i;
			if (sum > 10) {

				System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
				break;
			}
			i++;
		}
	}

	/*
	* for문은 증가하는 값이 무엇인지 초기식과 증감식을 통해서 쉽게 확인할 수 있다.
	* 이 코드나 while문을 보면 어떤 값이 반복에 사용되는 증가 값인지 즉시 확인하기는 어렵다.
	* */
}