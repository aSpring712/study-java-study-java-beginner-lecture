package cond;

/**
 * If1
 *
 * 조건문 - if
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-24
 * @version 1.0
 */
public class If1 {

	/*
	* if문
	* if문은 특정 조건이 참인지 확인하고, 그 조건이 참(true)일 경우 특정 코드 블록을 실행한다.
	*
	* if (condition) {
	* 	// 조건이 참일 때 실행되는 코드
	* }
	* */

	public static void main(String[] args) {


		int age = 20; // 사용자 나이

		if (age >= 18) {
			System.out.println("성인입니다.");
		}

		if (age < 18) {
			System.out.println("미성년자입니다.");
		}
	}
}