package loop;

/**
 * Break3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Break3 {

	// i가 증가하는 값 -> 다음과 같이 i를 for문에 넣어서 관리하도록 변경하면 더 깔끔한 코드가 된다.

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; ; i++) {
			sum += i;
			if (sum > 10) {
				System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
				break;
			}
		}
	}

	/*
	* for문 없이 while문으로 모든 반복을 다룰 수 있다. 하지만 카운터 변수가 명확하거나, 반복 횟수가 정해진 경우에는
	* for문을 사용하는 것이 구조적으로 더 깔끔하고, 유지보수 하기 좋다.
	* 
	* for문을 좀 더 편리하게 사용하도록 도와주는 향상된 for문 또는 for-each문으로 불리는 반복문도 있다.
	* */
}