package cond.quiz;

/**
 * Exchange Rate Ex
 *
 * Q. 환율 계산하기
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class ExchangeRateEx {

	/*
	* Q. 환율 계산하기
	* 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자.
	* 환율은 1달러당 1,300원이라고 가정하자. 다음과 같은 기준을 따른다.
	*
	* - 달러가 0미만이면: "잘못된 금액입니다."
	* - 달러가 0일 때: "환전할 금액이 없습니다."
	* - 달러가 0일 초과일 때: "환전 금액은 (계산된 원화 금액)원 입니다."
	*
	* 금액은 변수(int dollar)로 지정하고, 해당 변수를 기반으로 한국 원으로의 환전 금액을 출력하자.
	*
	* 출력 예시
	* dollar: -5
	* 출력: 잘못된 금액입니다.
	*
	* dollar: 0
	* 출력: 환전할 금액이 없습니다.
	*
	* dollar: 10
	* 출력: 환전 금액은 13000원입니다.
	* */

	public static void main(String[] args) {

		int dollar = 10;

		if (dollar < 0) {
			System.out.println("잘못된 금액입니다.");
		} else if(dollar == 0) {
			System.out.println("환전할 금액이 없습니다.");
		} else {
			int won = dollar * 1300;
			System.out.println("환전 금액은 " + won + "원 입니다.");
		}
	}
}