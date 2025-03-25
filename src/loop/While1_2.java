package loop;

/**
 * While1_2
 *
 * while문 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class While1_2 {

	/*
	* while문은 조건에 따라 코드를 반복해서 실행할 때 사용한다.
	* while (조건식) {
	* 	// 코드
	* }
	*
	* - 조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while문을 벗어난다.
	* - 조건식이 참이면 코드 블럭을 실행한다. 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다. (무한 반복)
	*
	* while문을 사용해서 1을 한 번씩 더해서 총 3번 더하는 코드를 만들어보자
	* */

	public static void main(String args[]) {

		int count = 0;

		while (count < 3) {
			count++;
			System.out.println("현재 숫자는: " + count);
		}
	}

	/*
	* while (count < 3)에서 코드 블럭을 반복 실행한다. 여기서 count의 값이 1, 2, 3으로 점점 커지다가 결국 count < 3이 거짓이 되면서 while문을 빠져나간다.
	* while (count < 3)에 있는 숫자를 while (count < 100)으로 변경하면 while문의 코드 블럭을 100번 반복한다.
	* */
}