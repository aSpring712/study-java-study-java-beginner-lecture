package array;

/**
 * Array Di 3
 *
 * 2차원 배열 - 리펙토링2
 * 구조 개선 - 초기화, 배열의 길이
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayDi3 {

	/*
	* 2가지 개선할 부분 존재
	* 1. 초기화: 기존 배열처럼 2차원 배열도 편리하게 초기화 할 수 있다.
	* 2. for문에서 배열의 길이 활용: 배열의 길이가 달라지면 for문에서 row < 2, column < 3 같은 부분을 같이 변경해야 한다.
	* 	이 부분을 배열의 길이를 사용하도록 변경해보자. 배열이 커지거나 줄어들어도 for문의 코드를 변경하지 않고 그대로 유지할 수 있다.
	* */

	public static void main(String[] args) {
		// 2 x 3 2차원 배열 초기화
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		// 2차원 배열의 길이를 활용
		for (int row = 0; row < arr.length; row++) { // arr.length: 행의 길이
			for (int column = 0; column < arr[row].length; column++) { // arr[row].length: 열의 길이
				System.out.print(arr[row][column] + "  ");
			}
			System.out.println();
		}
	}
}