package array.quiz;

import java.util.Scanner;

/**
 * Array Ex 6
 *
 * 문제 - 가장 작은 수, 큰 수 찾기
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayEx6 {

	public static void main(String[] args) {
		// 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자.

		Scanner scanner = new Scanner(System.in);

		System.out.println("입력받을 숫자의 개수를 입력하세요: ");
		int n = scanner.nextInt();

		int[] numbers = new int[n];
		int minNumber, maxNumber;

		System.out.println(n + "개의 정수를 입력하세요:");

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		minNumber = maxNumber = numbers[0];

		for (int i = 0; i < n; i++) {

			if (numbers[i] < minNumber) {
				minNumber = numbers[i];
			}

			if (numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
		}

		System.out.println("가장 작은 정수: " + minNumber);
		System.out.println("가장 큰 정수: " + maxNumber);
	}
}