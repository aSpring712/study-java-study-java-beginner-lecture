package array;

/**
 * Array 1 Ref 4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class Array1Ref4 {

	public static void main(String[] args) {

		// 배열 생성 간략 버전, 배열 선언과 함께 사용시 new int[] 생략 가능
		int[] students = {90, 80, 70, 60, 50};

		for (int i = 0; i < students.length; i++) {
			System.out.println("학생 " + (i+1) + " 점수: " + students[i]);
		}
	}

	/*
	* 이제 학생의 점수를 추가해도 {90, 80, 70, 60, 50}의 내용만 변경하면 된다. 그러면 나머지 코드는 변경하지 않아도 된다.
	* 배열을 사용한 덕분에 프로그램을 전체적으로 잘 구조화 할 수 있었다.
	* */
}