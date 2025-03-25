package cond;

/**
 * Switch2
 *
 * Switch문
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Switch2 {

	public static void main(String[] args) {

		// 앞서 작성한 코드를 switch문으로 변경해보자.

//		// grade 1: 1000, 2: 2000, 3: 3000, 나머지: 500
//		int grade = 1;
//
//		int coupon;
//		if (grade == 1) {
//			coupon = 1000;
//		} else if (grade == 2) {
//			coupon = 2000;
//		} else if (grade == 3) {
//			coupon = 3000;
//		} else {
//			coupon = 500;
//		}
//		System.out.println("발급받은 쿠폰 " + coupon);

		int grade = 1;

		int coupon;

		switch (grade) {
			case 1:
				coupon = 1000;
				break;
			case 2:
				coupon = 2000;
				break;
			case 3:
				coupon = 3000;
				break;
			default:
				coupon = 500;
		}
		System.out.println("발급받은 쿠폰 " + coupon);
	}
}