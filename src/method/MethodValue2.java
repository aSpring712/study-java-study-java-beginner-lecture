package method;

/**
 * Method Value 2
 *
 * 메서드 호출과 값 전달 2
 * 메서드 호출과 이름이 같은 변수
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodValue2 {

	public static void main(String[] args) {

		int number = 5;
		System.out.println("1. changeNumber 호출 전, number: " + number); // 출력: 5

		changeNumber(number);

		System.out.println("4. changeNumber 호출 후, number: " + number); // 출력: 5

	}

	public static void changeNumber(int number) { // main()에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘다 number로 같다.

		System.out.println("2. changeNumber 변경 전, number: " + number); // 출력: 5

		number = number * 2;

		System.out.println("3. changeNumber 변경 후, number: " + number); // 출력: 10
	}
}