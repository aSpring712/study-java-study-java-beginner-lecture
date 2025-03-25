package scope;

/**
 * Scope3_2
 *
 * 스코프 존재 이유
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-03-25
 * @version 1.0
 */
public class Scope3_2 {

	public static void main(String[] args) {

		int m = 10;

		if (m > 0) {

			int temp = m * 2; // temp는 if 코드 블록 안으로 스코프가 줄어든다. 덕분에 메모리를 빨리 제거 -> 메모리를 효율적으로 사용, temp 변수를 생각해야 하는 범위를 줄여서 더 유지보수 하기 좋은 코드가 됨
			System.out.println("temp = " + temp);
		}

		System.out.println("m = " + m);
	}
}