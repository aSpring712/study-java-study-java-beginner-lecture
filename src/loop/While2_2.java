package loop;

/**
 * While2_2
 *
 * while문 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class While2_2 {

	/*
	* 10부터 하나씩 증가하는 수를 3번 더해라 (10 ~ 12 더하기) 라는 문제가 있다고 하면,
	* 10 + 11 + 12를 계산해야 한다. 문제는 코드를 너무 많이 변경해야 한다는 점이다.
	*
	* 변수를 사용해서 더 변경하기 쉬운 코드로 만들어보자. 변경되는 부분을 변수 i로 바꾸어보자.
	* Q. i부터 하나씩 증가하는 수를 3번 더해라 (i ~ i+2 더하기)
	* */

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

		sum = sum + i; // sum(0) + i(1) -> sum(1)
		System.out.println("i = " + i + " sum = " + sum);
		i++; // i = 2

		sum = sum + i; // sum(1) + i(2) -> sum(3)
		System.out.println("i = " + i + " sum = " + sum);
		i++; // i = 3

		sum = sum + i; // sum(3) + i(3) -> sum(6)
		System.out.println("i = " + i + " sum = " + sum);
	}

	/*
	* 변수 i를 사용한 덕분에 i의 값만 변경하면 나머지 코드를 전혀 변경하지 않아도 된다.
	* i = 10으로 변경하면 다른 코드의 변경 없이 앞서 이야기한 10 + 11 + 12의 문제도 바로 풀 수 있다.
	*
	* 좋은 코드인지 아닌지는 변경 사항이 발생했을 때 알 수 있다. 변경 사항이 발생했을 때 변경해야 하는 부분이 적을수록 좋은 코드이다.
	* */
}