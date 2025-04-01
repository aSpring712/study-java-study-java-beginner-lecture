package method;

/**
 * Method2
 *
 * 매개변수가 없거나 반환 타입이 없는 경우
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class Method2 {

	public static void main(String[] args) {
		printHeader();
		System.out.println("프로그램이 동작합니다.");
		printFooter();
	}

	public static void printHeader() {
		System.out.println("= 프로그램을 시작합니다 =");
		return; // void의 경우 생략 가능
	}

	public static void printFooter() {
		System.out.println("= 프로그램을 종료합니다 =");
	}
}