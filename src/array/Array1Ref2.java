package array;

/**
 * Array 1 Ref 2
 *
 * 배열 리펙토링 - 변수 값 사용
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class Array1Ref2 {

	/*
	* 배열 리펙토링 - 변수 값 사용
	* 이제 배열을 사용해서 코드를 단계별로 리펙토링 해보자.
	* 먼저 변수 값을 사용한 부분을 변경해보자.
	* */

	public static void main(String[] args) {

		int[] students = new int[5];

		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;

		System.out.println("학생2 점수: " + students[1]);
		System.out.println("학생3 점수: " + students[2]);
		System.out.println("학생4 점수: " + students[3]);
		System.out.println("학생5 점수: " + students[4]);
//		변수명이 students로 같기 때문에 숫자가 반복되는 부분만 해결하면 반복문을 도입할 수 있을 것 같다. for문을 사용해서 문제를 해결해보자.
	}
}