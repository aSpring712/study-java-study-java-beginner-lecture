package loop;

/**
 * DoWhile1
 *
 * do-while문
 * do-while문은 while문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class DoWhile1 {

	/*
	* do-while문 구조
	* do {
	* 	// 코드
	* } while (조건식);
	* */

	public static void main(String[] args) {

		/*
		* 예를 들어서 조건에 만족하지 않아도 한 번은 현재 값을 출력하고 싶다고 하자.
		* 먼저 while문을 사용한 예제를 보자.
		* */
		int i = 10;
		while (i < 3) {
			System.out.println("현재 숫자는: " + i);
			i++;
		}
//		i=10이기 때문에 while (i < 3) 조건식은 거짓이 된다. 따라서 아무것도 출력되지 않는다.
	}
}