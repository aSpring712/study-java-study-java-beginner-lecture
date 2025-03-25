package scope;

/**
 * Scope 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Scope1 {

	public static void main(String[] args) {

		int m = 10; // m 생존 시작 -> main{} 코드 블록 안에서 선언 -> 변수 선언 시점부터 main{} 코드 블록이 종료될 때까지 생존
		if (true) { // if{} 블록 내부에서도 외부 블록에서 선언된 m에 접근할 수 있다. -> 생존 범위만 맞으면 다 접근할 수 있다.
			int x = 20; // x 생존 시작 -> if{}블록 안에서 선언 -> 변수를 선언한 시점부터 if{} 코드 블록이 종료될 때 까지 생존
			System.out.println("if m = " + m); // 블록 내부에서 블록 외부는 접근 가능
			System.out.println("if x = " + x);
		} // x 생존 종료

//		System.out.println("main x = " + x); // 오류, 변수 x에 접근 불가 (cannot find symbol -> 변수 이름을 찾을 수 없다는 컴파일 오류 발생)
		System.out.println("main m = " + m);
	} // m 생존 종료

	/*
	* 이렇게 변수의 접근 가능한 범위를 스코프(Scope)라고 한다. 직역하면 범위라는 뜻이다.
	* int m은 main{} 전체에서 접근할 수 있기 때문에 스코프가 넓고, int x는 if{} 코드 블록 안에서만 접근할 수 있기 때문에 스코프가 좁다.
	* */
}