package cond;

/**
 * If3
 *
 * else if
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-24
 * @version 1.0
 */
public class If3 {

	/*
	* Q. 연령에 따라 다른 메시지를 출력하는 프로그램을 작성해야 한다.
	* 이 프로그램은 int age라는 변수를 사용해야 하며, 연령에 따라 다음의 출력을 해야 한다.
	*
	* 7세 이하: "미취학"
	* 8세 이상 13세 이하: "초등학생"
	* 14세 이상 16세 이하: "중학생"
	* 17세 이상 19세 이하: "고등학생"
	* 20세 이상: "성인"
	*
	* if문을 사용해서 코드를 작성해보자.
	* */

	public static void main(String[] args) {

		int age = 14;

		if (age <= 7) {
			System.out.println("미취학");
		}

		if (8 <= age && age <= 13) {
			System.out.println("초등학생");
		}

		if (14 <= age && age <= 16) {
			System.out.println("중학생");
		}

		if (17 <= age && age <= 19) {
			System.out.println("고등학생");
		}

		if (age >= 20) {
			System.out.println("성인");
		}

		/*
		* 이 코드는 다음과 같은 단점이 있다.
		* - 불필요한 조건 검사: 이미 조건을 만족해도 불필요한 다음 조건을 계속 검사한다.
		* - 코드 효율성: 예를 들어서 나이가 8살인 초등학생이라면 미취학을 체크하는 조건인 age <= 7을 통해서 나이가 이미 8살이 넘는다는 사실을 알 수 있다.
		* 	그런데 바로 다음에 있는 초등학생을 체크하는 조건에서 age >= 8 && age <= 13라는 2가지 조건을 모두 수행한다.
		* 	여기서 age >= 8이라는 조건은 이미 앞의 age <= 7이라는 조건과 관련이 있다. 결과적으로 조건을 중복 체크한 것이다.
		*
		* 이런 코드에 else if를 사용하면 불필요한 조건 검사를 피하고 코드의 효율성을 향상시킬 수 있다.
		* */
	}
}