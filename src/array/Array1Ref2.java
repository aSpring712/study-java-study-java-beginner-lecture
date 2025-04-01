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

//		System.out.println("학생1 점수: " + students[0]);
//		System.out.println("학생2 점수: " + students[1]);
//		System.out.println("학생3 점수: " + students[2]);
//		System.out.println("학생4 점수: " + students[3]);
//		System.out.println("학생5 점수: " + students[4]);
//		변수명이 students로 같기 때문에 숫자가 반복되는 부분만 해결하면 반복문을 도입할 수 있을 것 같다. for문을 사용해서 문제를 해결해보자.

		for (int i = 0; i < students.length; i++) {
			System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
		}
	}

	/*
	* - 반복문을 사용해서 배열을 통해 값을 사용하는 부분을 효과적으로 변경했다.
	* - 배열의 인덱스는 0부터 시작하기 때문에 반복문에서 i = 0을 초기값으로 사용했다.
	* - students.length
	* 	- 배열의 길이를 제공하는 특별한 기능이다.
	* 	- 참고로 이 값은 조회만 할 수 있다. 대입은 할 수 없다.
	* 	- 현재 배열의 크기가 5이기 때문에 여기서는 5가 출력된다.
	* - for문의 조건이 i < students.length이기 때문에 i는 0, 1, 2, 3, 4 까지만 반복한다.
	* 	- i가 5가 되면 5 < 5가 되면서 조건이 거짓이 되고, 반복을 종료한다.
	* */
}