package array.quiz;

import java.util.Scanner;

/**
 * Array Ex 4
 *
 * 문제 - 합계와 평균
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayEx4 {

	public static void main(String[] args) {

		//	사용자에게 5개의 정수를 입력받아서 이등 정수의 합계와 평균을 계산하는 프로그램을 작성하자.

		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		double average;

		System.out.println("5개의 정수를 입력하세요:");
		for (int i = 0; i < 5; i++) {

			numbers[i] += scanner.nextInt();
			sum += numbers[i];
		}

		average = (double) sum / 5;

		System.out.println("입력한 정수의 합계: " + sum);
		System.out.println("입력한 정수의 평균: " + average);
	}
}