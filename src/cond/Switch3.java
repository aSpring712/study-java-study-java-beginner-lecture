package cond;

/**
 * Switch3
 *
 * switch문 - break 문이 없으면?
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Switch3 {

	public static void main(String[] args) {

		/*
		* 만약 break문이 없으면 어떻게 되는지 확인하기 위해 조건을 변경
		* 비즈니스 요구사항 변경: 2등급도 3등급과 같이 3000원 쿠폰을 준다
		* */

		// grade 1: 1000, 2: 3000(변경), 3: 3000, 나머지: 500
		int grade = 2;

		int coupon;
		switch (grade) {
			case 1:
				coupon = 1000;
				break; // grade가 1일 때, 이 부분에서 break문을 뺀다면 coupon에는 3000이라는 값이 할당되고 break;문을 만나 빠져나감
			case 2:
			case 3:
				coupon = 3000;
				break;
			default:
				coupon = 500;
				break;
		}
		System.out.println("발급받은 쿠폰 " + coupon);
	}
}