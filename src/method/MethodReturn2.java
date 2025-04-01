package method;

/**
 * Method Return 2
 *
 * return 문을 만나면 그 즉시 메서드를 빠져나간다.
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodReturn2 {

	/*
	* - 18살 미만의 경우: 미성년자는 출입이 불가합니다.
	* - 18살 이상의 경우: 입장하세요.
	* */

	public static void main(String[] args) {

		checkAge(10);
		checkAge(20);
	}

	public static void checkAge(int age) {

		if (age < 18) {
			System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
			return; // 18세 미만 -> 출력 후 바로 return 문이 수행되어 다음 로직을 수행하지 않고, 해당 메서드를 빠져나온다.
		}

		System.out.println(age + "살, 입장하세요.");
		return; // 생략 가능
	}
}