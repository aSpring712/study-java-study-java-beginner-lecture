package array.quiz;

/**
 * Array Ex 1
 *
 * 문제 - 배열을 사용하도록 변경
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-01
 * @version 1.0
 */
public class ArrayEx1 {

	/*
	* Q. 배열을 사용하도록 변경
	* */

	public static void main(String[] args) {

//		int student1 = 90;
//		int student2 = 80;
//		int student3 = 70;
//		int student4 = 60;
//		int student5 = 50;
//
//		int total = student1 + student2 + student3 + student4 + student5;
//		double average = (double) total / 5;
//
//		System.out.println("점수 총합: " + total); // 점수 총합: 350
//		System.out.println("점수 평균: " + average); // 점수 평균: 70.0

		int[] students = {90, 80, 70, 60, 50};

		int total = 0;
//		double average;
//		int i = 0;
//
//		for (int student : students) {
//			total += student;
//			i++;
//		}
//
//		average = (double) total / i;
//
//		System.out.println("점수 총합: " + total);
//		System.out.println("점수 평균: " + average);

		for (int i = 0; i < students.length; i++) {
			total += students[i];
		}

		double average = total / students.length;
		System.out.println("점수 총합: " + total);
		System.out.println("점수 평균: " + average);
	}
}