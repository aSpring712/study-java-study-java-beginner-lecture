package loop;

/**
 * While1_1
 *
 * 반복문 시작
 * 반복문은 이름 그대로 특정 코드를 반복해서 실행할 때 사용한다.
 * 자바는 3가지 종류(while, do-while, for)의 반복문을 제공한다.
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class While1_1 {

	// 1을 한 번씩 더해서 총 3번 더하는 간단한 코드를 만들어보자.
	public static void main(String[] args) {

		int count = 0;

		// case1
//		count = count + 1;
//		System.out.println("현재 숫자는: " + count);
//		count = count + 1;
//		System.out.println("현재 숫자는: " + count);
//		count = count + 1;
//		System.out.println("현재 숫자는: " + count);

		// case2 - 증갑 연산자(++) 사용
		count++;
		System.out.println("현재 숫자는: " + count);
		count++;
		System.out.println("현재 숫자는: " + count);
		count++;


		/*
		* 같은 코드가 3번 반복되고 있다.
		* 1을 한 번씩 더해서 총 100번 더하는 코드를 만들어보자. 아마도 직접 작성한다면 같은 코드가 100번 반복될 것이다.
		* 이렇게 특정 코드를 반복해서 실행할 때 사용하는 것이 바로 반복문이다.
		* 반복문에는 while, for문이 있다.
		* */
	}
}