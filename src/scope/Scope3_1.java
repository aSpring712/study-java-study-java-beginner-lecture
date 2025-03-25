package scope;

/**
 * Scope3_1
 *
 * 스코프 존재 이유
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Scope3_1 {

	public static void main(String[] args) {

		int m = 10;
		int temp = 0;
		if (m > 0) {
			temp = m * 2;
			System.out.println("temp = " + temp);
		}
		System.out.println("m = " + m);
	}

	/*
	* 조건이 맞으면 변수 m의 값을 2배 증가해서 출력하는 코드
	* -> 2배 증가한 값을 저장해두기 위해 임시 변수 temp를 사용
	* -> 좋은 코드 X
	* -> 임시 변수 temp는 if 조건이 만족할 때 임시로 잠깐 사용하는 변수인데 main() 코드 블록에 선언되어 있음
	* -> 다음과 같은 문제가 발생
	*
	* - 비효율적인 메모리 사용: if 코드 블록에서만 필요 -> main() 코드 블록이 종료될 때 까지 메모리에 유지 -> 낭비
	* - 코드 복잡성 증가: 스코프가 불필요하게 넓음 -> 실무에서는 코드가 복잡한 경우가 많으므로 if 코드 블록 안에 temp를 선언하여 머리속에서 생각할 변수를 하나 줄이기
	* */
}