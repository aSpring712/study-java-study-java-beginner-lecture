package operator.quiz;

/**
 * OperationEx2
 *
 * double과 평균
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-24
 * @version 1.0
 */
public class OperationEx2 {

	public static void main(String[] args) {

		/*
		* 다음 double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램을 작성하세요.
		* double var1 = 1.5;
		* double var2 = 2.5;
		* double var3 = 3.5;
		* */

		double var1 = 1.5;
		double var2 = 2.5;
		double var3 = 3.5;

		double sum = var1 + var2 + var3;
		double average = sum / 3;

		System.out.println(sum);
		System.out.println(average);
	}
}