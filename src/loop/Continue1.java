package loop;

/**
 * Continue1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Continue1 {

	/*
	* Q. 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.
	* */

	public static void main(String[] args) {

		int i = 1;

		while (i <= 5) {

			if (i == 3) {
				i++;
				continue;
			}
			System.out.println("i = " + i);
			i++;
		}
	}
}