package cond;

/**
 * If4
 *
 * else if
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-24
 * @version 1.0
 */
public class If4 {

	/*
	* else if
	* else if문은 앞선 if문의 조건이 거짓일 때 다음 조건을 검사한다. 만약 앞선 if문이 참이라면 else if를 실행하지 않는다.
	*
	* if - else 코드
	* if (condition1) {
	* 	// 조건1이 참일 때 실행되는 코드
	* } else if (condition2) {
	* 	// 조건1이 거짓이고 조건2가 참일 때 실행되는 코드
	* } else if (condition3) {
	* 	// 조건2가 거짓이고, 조건3이 참일 때 실행되는 코드
	* } else {
	* 	// 모든 조건이 거짓일 때 실행되는 코드
	* }
	*
	* 쉽게 이야기해서 이렇게 전체 if문을 하나로 묶는다고 보면 된다. 이렇게 하면 특정 조건이 만족하면 해당 코드를 실행하고 if문 전체를 빠져나온다.
	* 특정 조건을 만족하지 않으면 다음 조건을 검사한다. 여기서 핵심은 순서대로 맞는 조건을 찾아보고, 맞는 조건이 있으면 딱 1개만 실행이 되는 것이다.
	* 참고로 else는 생략할 수 있다.
	* */

	public static void main(String[] args) {

			// if3의 코드를 else if를 사용해서 완성해보자.

//			int age = 14;
//
//			if (age <= 7) {
//				System.out.println("미취학");
//			}
//
//			if (8 <= age && age <= 13) {
//				System.out.println("초등학생");
//			}
//
//			if (14 <= age && age <= 16) {
//				System.out.println("중학생");
//			}
//
//			if (17 <= age && age <= 19) {
//				System.out.println("고등학생");
//			}
//
//			if (age >= 20) {
//				System.out.println("성인");
//			}

		int age = 14;

		if (age <= 7) {
			System.out.println("미취학");
		} else if (age <= 13) {
			System.out.println("초등학생");
		} else if (age <= 16) {
			System.out.println("중학생");
		} else if (age <= 19) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
	}
}