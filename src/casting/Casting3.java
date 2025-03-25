package casting;

/**
 * Casting3
 *
 * 형변환과 오버플로우
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Casting3 {

	public static void main(String[] args) {

		long maxIntValue = 2147483647; // int 최고값
		long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
		int intValue = 0;

		intValue = (int) maxIntValue; // 형변환
		System.out.println("maxIntValue casting = " + intValue); // 출력: 2147483647

		intValue = (int) maxIntOver; // 형변환
		System.out.println("maxIntOver casting = " + intValue); // 출력: -2147483648
	}
}