package method;

/**
 * Method Casting 2
 *
 * 자동 형변환
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodCasting2 {

	public static void main(String[] args) {

		int number = 100;
		printNumber(number); // int에서 double로 자동 형변환
	}

	public static void printNumber(double n) {
		System.out.println("숫자: " + n);
	}
}