package method;

/**
 * Overloading2
 *
 * 매개변수의 타입이 다른 오버로딩 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class Overloading2 {

	public static void main(String[] args) {

		myMethod(1, 1.2);
		myMethod(1.2, 1);
	}

	public static void myMethod(int a, double b) {
		System.out.println("int a, double b");
	}

	public static void myMethod(double a, int b) {
		System.out.println("double a, int b");
	}
}