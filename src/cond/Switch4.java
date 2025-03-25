package cond;

/**
 * Switch4
 *
 * 자바 14 새로운 switch문
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Switch4 {

	/*
	* switch문은 if문 보다 조금 덜 복잡한 것 같지만, 그래도 코드가 기대보다 깔끔하게 나오지는 않는다.
	* 이런 문제를 해결하고자 자바14부터는 새로운 switch문이 정식 도입되었다.
	* 기존 코드를 새로운 switch문으로 개발하면 다음과 같다.
	*
	* 기존 switch문과 차이는 다음과 같다.
	* - -> 를 사용한다.
	* - 선택된 데이터를 반환할 수 있다.
	* */

	public static void main(String[] args) {
//		// grade 1: 1000, 2: 3000(변경), 3: 3000, 나머지: 500
//		int grade = 2;
//
//		int coupon;
//		switch (grade) {
//			case 1:
//				coupon = 1000;
//				break; // grade가 1일 때, 이 부분에서 break문을 뺀다면 coupon에는 3000이라는 값이 할당되고 break;문을 만나 빠져나감
//			case 2:
//			case 3:
//				coupon = 3000;
//				break;
//			default:
//				coupon = 500;
//				break;
//		}

		// grade 1: 1000, 2: 2000, 3: 3000, 나머지: 500
		int grade = 2;

		int coupon = switch (grade) {
			case 1 -> 1000;
			case 2 -> 2000;
			case 3 -> 3000;
			default -> 500;
		};
		System.out.println("발급받은 쿠폰 " + coupon);
	}
}