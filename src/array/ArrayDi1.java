package array;

/**
 * Array Di 1
 *
 * 2차원 배열 - 리펙토링1
 * 구조 개선 - 행 출력 반복
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayDi1 {

	/*
	 * 구조 변경
	 * 코드 구조를 보면 비슷한 부분이 반복된다.
	 * */

//		// 0행 출력
//		System.out.print(arr[0][0] + "  "); // 0열 출력
//		System.out.print(arr[0][1] + "  "); // 1열 출력
//		System.out.print(arr[0][2] + "  "); // 2열 출력
//		System.out.println(); // 한 행이 끝나면 라인을 변경한다.
//
//		// 1행 출력
//		System.out.print(arr[1][0] + "  "); // 0열 출력
//		System.out.print(arr[1][1] + "  "); // 1열 출력
//		System.out.print(arr[1][2] + "  "); // 2열 출력
//		System.out.println(); // 한 행이 끝나면 라인을 변경한다.

	/*
	 * 코드를 보면 행을 출력하는 부분이 거의 같다. 차이가 있는 부분은 행에서 arr[0]으로 시작할지 arr[1]로 시작할지의 차이다.
	 *
	 * 다음과 같이 행(row)에 들어가는 숫자만 하나씩 증가하면서 반복하면 될 것 같다.
	 * */

//		System.out.println(arr[row][0] + "  "); // 0열 출력
//		System.out.println(arr[row][1] + "  "); // 1열 출력
//		System.out.println(arr[row][2] + "  "); // 2열 출력

//		반복문을 사용하여 코드를 변경해보자.

	public static void main(String[] args) {

		// 2 x 3 2차원 배열을 만듭니다.
		int[][] arr = new int[2][3]; // 행(row), 열(column)
		arr[0][0] = 1; // 0행, 0열
		arr[0][1] = 2; // 0행, 1열
		arr[0][2] = 3; // 0행, 2열
		arr[1][0] = 4; // 1행, 0열
		arr[1][1] = 5; // 1행, 1열
		arr[1][2] = 6; // 1행, 2열

		for (int row = 0; row < 2; row++) {
			System.out.print(arr[row][0] + "  "); // 0열 출력
			System.out.print(arr[row][1] + "  "); // 1열 출력
			System.out.print(arr[row][2] + "  "); // 2열 출력
			System.out.println(); // 한 행이 끝나면 라인을 변경한다.
		}
	}

	/*
	* - for문을 통해서 행(row)을 반복해서 접근한다. 각 행 안에서 열(column)이 3개이므로 arr[row][0], arr[row][1], arr[row][2] 3번 출력된다.
	* 	이렇게하면 for문을 한번 도는 동안 3개의 열을 출력할 수 있다.
	* 	- row = 0의 for문이 실행되면 arr[0][0], arr[0][1], arr[0][2]로 1 2 3 이 출력된다.
	* 	- row = 1의 for문이 실행되면 arr[1][0], arr[1][1], arr[1][2]로 4 5 6 이 출력된다.
	* */
}