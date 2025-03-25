package loop;

/**
 * While2_3
 *
 * while문 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class While2_3 {

	/*
	* Q. i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)
	*
	* i = 1, endNum = 3이라고 생각하고 단순하게 문제를 풀어보자.
	* */

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		int endNum = 3;

		/*
		* i = 1, endNum = 3이므로 다음 코드를 총 3번 반복해야 한다. i = 1, endNum = 10이면 이 코드를 총 10번 반복해야 한다. 따라서 같은 코드를 더 많이 추가해야 한다.
		* 이 문제를 제대로 풀기 위해서는 코드가 실행되는 횟수를 유연하게 변경할 수 있어야 한다. 한마디로 같은 코드를 반복 실행할 수 있어야 한다.
		* */
//		sum = sum + i;
//		System.out.println("i = " + i + " sum = " + sum);
//		i++;
//
//		sum = sum + i;
//		System.out.println("i = " + i + " sum = " + sum);
//		i++;
//
//		sum = sum + i;
//		System.out.println("i = " + i + " sum = " + sum);
//		i++;

		// while문을 사용하면 원하는 횟수 만큼 같은 코드를 반복 실행할 수 있다.
		while (i <= endNum) { // i가 endNum이 될때 까지 코드 블럭을 실행한다. i가 endNum보다 크면 while문을 종료한다.
			sum = sum + i;
			System.out.println("i = " + i + " sum = " + sum);
			i++;
		}
	}

	/*
	* 반복 횟수 정하기
	* i가 endNum이 될때 까지 반복해서 코드를 실행하면 된다.
	* - i = 1, endNum = 3이라면 3번 반복하면 된다. i = 1 -> 2 -> 3
	* - i = 3, endNum = 4라면 2번 반복하면 된다. i = 3 -> 4
	* */
}