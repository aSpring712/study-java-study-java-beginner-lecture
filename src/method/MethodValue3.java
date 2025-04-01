package method;

/**
 * Method Value 3
 *
 * 메서드 호출과 값 반환받기
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodValue3 {

	public static void main(String[] args) {

		int num1 = 5;

		System.out.println("changeNumber 호출 전, num1: " + num1); // 출력: 5

		num1 = changeNumber(num1);

		System.out.println("changeNumber 호출 후, num1: " + num1); // 출력: 10
	}

	public static int changeNumber(int num2) {

		num2 = num2 * 2;
		return num2;
	}
}