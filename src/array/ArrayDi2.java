package array;

/**
 * Array Di 2
 *
 * 2차원 배열 - 리펙토링 1
 * 구조 개선 - 열 출력 반복
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayDi2 {

//		다음 부분을 보면 같은 코드가 반복된다.
//		System.out.println(arr[row][0] + "  "); // 0열 출력
//		System.out.println(arr[row][1] + "  "); // 1열 출력
//		System.out.println(arr[row][2] + "  "); // 2열 출력

//		다음과 같이 열(column)에 들어가는 숫자만 하나씩 증가하면서 반복하면 될 것 같다.
//		column을 0, 1, 2로 변경하면서 다음 코드를 반복
//		System.out.print(arr[row][column] + "  "); // column 열 출력
//		코드를 수정해보자.

	public static void main(String[] args) {

		// 2 x 3 2차원 배열을 만듭니다.
		int[][] arr = new int[2][3]; // 행(row), 열(column)
		arr[0][0] = 1; // 0행, 0열
		arr[0][1] = 2; // 0행, 1열
		arr[0][2] = 3; // 0행, 2열
		arr[1][0] = 4; // 1행, 0열
		arr[1][1] = 5; // 1행, 1열
		arr[1][2] = 6; // 1행, 2열

		for (int row = 0; row < 2; row++) { // 첫번째 for문은 행을 탐색하고
			for (int column = 0; column < 3; column++) { // 내부에 있는 두번째 for문은 열을 탐색한다.
				System.out.print(arr[row][column] + "  ");
			}
			System.out.println(); // 한 행이 끝나면 라인을 변경한다.
		}
	}
}