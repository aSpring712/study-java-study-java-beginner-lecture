package method;

/**
 * Method Value 1
 *
 * 메서드 호출과 값 복사
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodValue1 {

//	숫자를 2배 곱하는 메서드이다. 다음 코드를 보고 어떤 결과가 나올지 먼저 생각해보자.

	public static void main(String[] args) {

		int num1 = 5;
		System.out.println("1. changeNumber 호출 전, num1: " + num1); // 5
		changeNumber(num1);
		System.out.println("4. changeNumber 호출 후, num1: " + num1); // 5
	}

	public static void changeNumber(int num2) {

		System.out.println("2. changeNumber 변경 전, num2: " + num2); // 5
		num2 = num2 * 2;
		System.out.println("3. changeNumber 변경 후, num2: " + num2); // 10
	}

	/*
	* "자바는 항상 변수의 값을 복사해서 대입한다."는 대원칙 !!
	* */
}