package method;

/**
 * Method Value 0
 *
 * 메서드 호출과 값 전달 1
 * 변수와 값 복사
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodValue0 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = num1; // num1(5)     -> 값을 복사해서 대입하는 부분 !
//		-> int num2 = 5; // num2 변수에 대입하기 전에 num1의 값 5를 읽는다. 결과: num1(5), num2(5)
		num2 = 10; // num2에 10을 대입한다. 결과: num1(5), num2(10)

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}