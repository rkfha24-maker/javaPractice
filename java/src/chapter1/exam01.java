package chapter1;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {

		//String name = "김자바";
		//int age = 25;
		//String tel1 = "010", tel2 = "123", tel3 = "4567";

		// System.out.println("이름 : " + name);
		// System.out.print("나이 : " + age);
		// System.out.printf("\n전화 : %s-%s-%s" , tel1 , tel2 , tel3);



		
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 수 : ");
		double num1 = Double.parseDouble(scanner.nextLine());

		System.out.print("두 번째 수 : ");
		double num2 = Double.parseDouble(scanner.nextLine());

		if ( num2 != 0 ) {
			System.out.println( "결과 : " + (num1/num2) );
		} else {
			System.out.println( "결과 : 무한대" );
		}
	}

}
