package cond;

/**
 * If5
 *
 * if문과 else if문
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-24
 * @version 1.0
 */
public class If5 {

	/*
	* Q. 온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
	* 각가의 할인 조건은 다음과 같다.
	*
	* - 아이템 가격이 10,000원 이상일 때, 1,000원 할인
	* - 나이가 10살 이하일 때 1,000원 할인
	*
	* 이 할인 시스템의 핵심은 **한 사용자가 동시에 여러 할인을 받을 수 있다는 점**이다.
	* */

	public static void main(String[] args) {

		int price = 10000; // 아이템 가격
		int age = 10; // 나이
		int discount = 0;

		if (price >= 10000) {
			discount = discount + 1000;
			System.out.println("10,000원 이상 구매, 1,000원 할인");
		}

		if (age <= 10) {
			discount = discount + 1000;
			System.out.println("어린이 1,000원 할인");
		}

		System.out.println("총 할인 금액: " + discount + "원");

		/*
		 * 이 코드에서는 각각 독립된 if문이 있다. 따라서 해당하는 모든 할인을 적용한다.
		 * 만약 else if를 쓰면, 첫 번째로 충족하는 조건만 할인이 적용되고 나머지는 무시된다. 따라서 사용자는 나머지 할인을 놓칠 수 있다.
		 * */
	}
}