package array;

/**
 * Array 1 Ref 1
 *
 * 배열의 선언과 생성
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class Array1Ref1 {

	/*
	* 배열의 선언과 생성
	* 배열은 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것이다. 이전 예제를 배열을 사용하도록 변경해보자.
	* 참고로 단계적으로 구조를 변경해 나갈 것이다.
	* */

	public static void main(String[] args) {

//		int student1 = 90;
//		int student2 = 80;
//		int student3 = 70;
//		int student4 = 60;
//		int student5 = 50;
//
//		System.out.println("학생1 점수: " + student1);
//		System.out.println("학생2 점수: " + student2);
//		System.out.println("학생3 점수: " + student3);
//		System.out.println("학생4 점수: " + student4);
//		System.out.println("학생5 점수: " + student5);

		int[] students; // 1. 배열 변수 선언
		students = new int[5]; // 2. 배열 생성 - 5개의 int 공간이 생성, 0으로 자동 초기화
//		int studnets = new int[5]; // (new int[5]의 결과로 x001 참조값 반환)
//		students = x001; // 최종 결과
//		System.out.println(students); // [I@4617c264 @ 앞의 [I는 int형 배열을 뜻한다. @뒤에 16진수는 참조값을 뜻한다.

//		배열에 값 대입
//		students[0] = 90; // 1. 배열에 값을 대입
//		x001[0] = 90; // 2. 변수에 있는 참조값을 통해 실제 배열에 접근. 인덱스를 사용해서 해당 위치의 요소에 접근, 값 대입

		/*
		* 배열 초기화: 숫자는 0, boolean은 false, String은 null로 초기화 된다.
		* */

		// 변수 값 대입
		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;

		// 변수 값 사용
		System.out.println("학생1 점수: " + students[0]); // 1. 변수 값 읽기
//		System.out.println("학생1 점수: " + x001[0]); // 2. 변수에 있는 참조값을 통해 실제 배열에 접근. 인덱스를 사용해서 해당 위치의 요소에 접근
//		System.out.println("학생1 점수: " + 90); // 3. 배열의 값을 읽어옴
//		배열을 사용하면 이렇게 참조값을 통해서 실제 배열에 접근하고 인덱스를 통해서 원하는 요소를 찾는다.

		System.out.println("학생2 점수: " + students[1]);
		System.out.println("학생3 점수: " + students[2]);
		System.out.println("학생4 점수: " + students[3]);
		System.out.println("학생5 점수: " + students[4]);

//		student[5]와 같이 접근 가능한 배열의 인덱스 범위를 넘어가면 다음과 같은 오류가 발생한다.
		/*
		* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out
		* of bounds for length 5 at array.Array1Ref1.main(Array1Ref1.java:14)
		* */
	}
}