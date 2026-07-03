package chapter4;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		/*
		 * <미니 계산기 만들기>
		 * - 조건 -
		 * 1.계산은 덧셈 ,뺄셈 , 곱셈 , 나눗셈 만 잘 동작하면 됨
		 * 2.숫자 두개는 입력받기
		 * 3.간단한 설명 출력해주기
		 * 4.코드마다 주석달기
		 * 5.소수로도 계산이 가능해야 함 1.5 + 3.7 => 5.2
		 * 6.출력형태는 소수점 둘째자리까지만 
		 * 
		 * */
		
		
		//미니 계산기 사용법
		Scanner sc = new Scanner(System.in);
		
		//숫자를 입력해주세요.
		System.out.print("숫자 1입력 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("숫자 2입력 : "); 
		double num2 = sc.nextDouble();
		
		
		//계산기호를 선택해주세요.
		System.out.print("계산기호 입력(+ - * /) : "); 
		String cal  = sc.next();
		
		//계산결과 값
		if( cal.equals("+") ) {
			System.out.println("계산결과는 : " + (num1 + num2)); 
		} else if (cal.equals("-")) {
			System.out.println("계산결과는 : " + (num1 - num2) ); 
		} else if (cal.equals("*")) {
			System.out.println("계산결과는 : " + (num1 * num2) ); 
		} else if (cal.equals("/")) {
			System.out.println("계산결과는 : " + (num1 / num2) ); 
		} else {
			System.out.println("잘못된 기호 입력" ); 
			
		}
		}
		}
	
	

