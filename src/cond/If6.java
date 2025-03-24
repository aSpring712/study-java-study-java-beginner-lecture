package cond;

/**
 * If6
 *
 * if문을 사용해야 하는 곳에 else if문 적용
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-24
 * @version 1.0
 */
public class If6 {

	public static void main(String[] args) {

		int price = 10000; // 아이템 가격
		int age = 10; // 나이
		int discount = 0;

		if (price >= 10000) {
			discount = discount + 1000;
			System.out.println("10,000원 이상 구매, 1,000원 할인");
		} else if (age <= 10) {
			discount = discount + 1000;
			System.out.println("어린이 1,000원 할인");
		} else {
			System.out.println("할인 없음");
		}

		System.out.println("총 할인 금액: " + discount + "원");

		/*
		* 첫 번째로 충족되는 조건인 1,000원 할인만 적용되고, if문을 빠져나온다. 따라서 사용자는 나머지 할인을 놓치게 된다.
		*
		* if문을 각각 사용할지, if와 else if를 함께 묶어서 사용할지는 요구사항에 따라 다르다. 둘의 차이를 이해하고 적절하게 사용하면 된다.
		* */
	}
}