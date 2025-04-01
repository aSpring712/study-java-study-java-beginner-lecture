package array.quiz;

import java.util.Scanner;

/**
 * Array Ex 5
 *
 * 문제 - 합계와 평균 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayEx5 {

	public static void main(String[] args) {

		// 이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.

		Scanner scanner = new Scanner(System.in);
		System.out.println("입력받을 숫자의 개수를 입력하세요: ");
		int count = scanner.nextInt();

		int[] numbers = new int[count];
		int sum = 0;
		double average;

		System.out.println(count + "개의 정수를 입력하세요:");
		for (int i = 0; i < count; i++) {
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}

		average = (double) sum / count;

		System.out.println("입력한 정수의 합계: " + sum);
		System.out.println("입력한 정수의 평균: " + average);
	}
}