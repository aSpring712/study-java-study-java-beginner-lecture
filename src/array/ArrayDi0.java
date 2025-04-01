package array;

/**
 * ArrayDi0
 *
 * 2차원 배열 - 시작
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayDi0 {

	public static void main(String[] args) {

		// 2 x 3 2차원 배열을 만든다.
		int[][] arr = new int[2][3]; // 행(row), 열(column)

		// - 2차원 배열을 만들고, 배열에 값을 1부터 6까지 순서대로 직접 입력한다.
		arr[0][0] = 1; // 0열, 0행
		arr[0][1] = 2; // 0열, 1행
		arr[0][2] = 3; // 0열, 2행
		arr[1][0] = 4; // 1열, 0행
		arr[1][1] = 5; // 1열, 1행
		arr[1][2] = 6; // 1열, 2행

		// 0행 출력
		System.out.print(arr[0][0] + "  "); // 0열 출력
		System.out.print(arr[0][1] + "  "); // 1열 출력
		System.out.print(arr[0][2] + "  "); // 2열 출력
		System.out.println(); // 한 행이 끝나면 라인을 변경한다.

		// 1행 출력
		System.out.print(arr[1][0] + "  "); // 0열 출력
		System.out.print(arr[1][1] + "  "); // 1열 출력
		System.out.print(arr[1][2] + "  "); // 2열 출력
		System.out.println(); // 한 행이 끝나면 라인을 변경한다.

		/*
		* 실행 결과
		* 1  2  3 // [0][0] [0][1] [0][2]
		* 4  5  6 // [1][0] [1][1] [1][2]
		*
		* 위와 같은 결과를 만들기 위해 0행에 있는 0, 1, 2열을 출력한다. 그리고 다음에는 1행에 있는 0, 1, 2열을 출력한다.
		* */
	}
}