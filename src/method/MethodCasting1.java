package method;

/**
 * Method Casting 1
 *
 * 메서드와 형변환
 * 명시적 형변환
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodCasting1 {

	public static void main(String[] args) {

		double number = 1.5;
//		printNumber(number); // double을 int형에 대입하므로 컴파일 오류 java: incompatible types: possible lossy conversion from double to int
		printNumber((int) number); // 명시적 형변환을 사용해 double을 int로 치환
	}

	public static void printNumber(int n) {
		System.out.println("숫자: " + n);
	}
}