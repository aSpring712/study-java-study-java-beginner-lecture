package method;

/**
 * Method Return 1
 *
 * 반환 타입
 * 반환 타입이 있으면 반드시 값을 반환해야 한다.
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class MethodReturn1 {

	public static void main(String[] args) {
		boolean result = odd(2);
		System.out.println(result);
	}

//	public static boolean odd(int i) {
//		if (i % 2 == 1) { // if 조건이 만족할 때는 true가 반환되지만, 조건을 만족하지 않는 경우에는 return문이 실행되지 않는다.
//			return true;
//		}
//
//		// 이 코드를 실행하면 return 문을 누락했다는 컴파일 오류가 발생한다: java: missing return statement
//	}

	public static boolean odd(int i) {
		if (i % 2 == 1) {
			return true;
		} else { // 이렇게 수정하면 if 조건을 만족하지 않아도 else를 통해 return 문이 실행된다.
			return false;
		}
	}
}