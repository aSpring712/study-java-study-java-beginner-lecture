package cond;

/**
 * Switch2
 *
 * switch문
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
				break; // default는 마지막에 실행되는 코드 블록이기 때문에, 논리적으로 그 아래 실행할 코드가 없다면 break;가 없어도 동작에는 문제가 없으나 가독성과 유지보수를 위해 명시적으로 추가하는 것이 좋음.
		}
		System.out.println("발급받은 쿠폰 " + coupon);
	}
}