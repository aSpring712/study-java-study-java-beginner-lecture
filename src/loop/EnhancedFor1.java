package loop;

/**
 * Enhanced For 1
 *
 * 향상된 for문
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class EnhancedFor1 {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5};

		// 일반 for문
		for (int i = 0; i < numbers.length; ++i) {
			int number = numbers[i];
			System.out.println(number);
		}

		// 향상된 for문, for-each문
		for (int number : numbers) {
			System.out.println(number);
		}

		// for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
		for(int i = 0; i < numbers.length; ++i) {
			System.out.println("number" + i + "번의 결과는: " + numbers[i]);
		}
	}
}