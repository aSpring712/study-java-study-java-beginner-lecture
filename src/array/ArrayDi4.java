package array;

/**
 * Array Di 4
 *
 * 구조 개선 - 값 입력
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayDi4 {

	/*
	* 이번에는 배열에 직접 1, 2, 3 숫자를 적어서 값을 할당하는 것이 아니라, 배열의 크기과 상관없이 배열에 순서대로 1씩 증가하는 값을 입력하도록
	* 변경해보자.
	* */

	public static void main(String[] args) {

		// 2 x 3 2차원 배열, 초기화
		int[][] arr = new int[4][5];

		int i = 1;
		// 순서대로 1씩 증가하는 값을 입력한다.
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = i++;
			}
		}
		/*
		* - 중첩된 for문을 사용해서 값을 순서대로 입력한다.
		* - arr[row][column] = i++; 후의 증감 연산자(++)를 사용해서 값을 먼저 대입한 다음에 증가한다.
		* 	- 코드에서 int i = 1로 i가 1부터 시작한다.
		* */

		// 2차원 배열의 길이를 활용
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column] + "  ");
			}
			System.out.println();
		}
	}
}