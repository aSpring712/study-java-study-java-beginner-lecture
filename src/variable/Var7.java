package variable;

/**
 * Var7
 *
 * 변수 타입1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-23
 * @version 1.0
 */
public class Var7 {

	public static void main(String[] args) {

		int a = 100; // 정수 -> 정수 리터럴
		double b = 10.5; // 실수 -> 실수 리터럴
		boolean c = true; // 불리언(boolean) true, false 입력 가능 -> 불리언 리터럴
		char d = 'A'; // 문자 하나 -> 문자 하나 리터럴
		String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입 -> 문자열 리터럴

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}

/*
* 변수는 데이터를 다루는 종류에 따라 다양한 형식(또는 형, type)이 존재한다.
* int 타입, int 형식, int형
*
* 자신의 타입에 맞는 데이터를 사용하지 않으면 컴파일 오류가 발생한다.
*
* 리터럴
* 코드에서 개발자가 직접 적은 100, 10.5, true, 'A', "Hello Java"와 같은 고정된 값을 리터럴(literal)이라 한다.
* 변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값 -> 리터럴 자체는 변하지 않는다.
* */