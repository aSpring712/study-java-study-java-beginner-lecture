package loop;

/**
 * For2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class For2 {

	/*
	* Q. i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)
	* for문을 사용해서 풀어보자
	* */

	public static void main(String[] args) {

		int sum = 0;
		int endNum = 3;

		for (int i = 1; i <= endNum; i++) {

			sum = sum + i;
			System.out.println("i = " + i + " sum = " + sum);
		}

		// while2_3과 비교
//		while (i <= endNum) { // i가 endNum이 될때 까지 코드 블럭을 실행한다. i가 endNum보다 크면 while문을 종료한다.
//			sum = sum + i;
//			System.out.println("i = " + i + " sum = " + sum);
//			i++;
//		}

		/*
		* 둘을 비교했을 때 for문이 더 깔끔하다는 느낌을 받을 것이다. for문은 초기화, 조건 검사, 반복 후 작업 등이 규칙적으로 한 줄에
		* 모두 들어 있어 코드를 이해하기 더 쉽다. 특히 반복을 위해 값이 증가하는 카운터 변수를 다른 부분과 명확하게 구분할 수 있다.
		*
		* for (int i = 1; i <= endNum; i++) 여기서 바로 변수 i가 카운터 변수이다.
		* 증가하면서 반복 횟수가 올라가고, 또 변수 i를 사용해서 계속 반복할지 아니면 빠져나갈지 판단할 수 있다.
		* 이렇게 반복 횟수에 직접적인 영향을 주는 변수를 선언부터, 값 증가, 또 조건식에 활용까지 for (초기식; 조건식; 증감식) 구조를 활용해서 처리하는 것이다.
		* 덕분에 개발자는 루프 횟수와 관련된 코드와 나머지 코드를 명확하게 구분할 수 있다.
		* 반면에 while을 보면 변수 i를 선언하는 부분 그리고 i++로 증가하는 부분이 기존 코드에 분산되어 있다.
		* */
	}
}