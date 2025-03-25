package casting;

/**
 * Casting2
 *
 * 명시적 형변환
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Casting2 {

	public static void main(String[] args) {

		double doubleValue = 1.5;
		int intValue = 0;

//		intValue = doubleValue; // 컴파일 오류 발생
		intValue = (int) doubleValue; // 형변환
		System.out.println(intValue); // 출력: 1
	}
}