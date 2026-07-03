package chapter3;

public class exam01 {

	public static void main(String[] args) {
		/**
		 * 연산자란??
		 *    a         +       b
		 *  피연산자     연산자    피연산자
		 * <연산자>
		 * 단한연산자 : 항이 한개인 식
		 *  ex) a++ , !a ...
		 * 이항연산자 : 항이 두개인 식
		 *  ex) a + b, a - b ...
		 * 삼함연산자 : 항이 세개인 식
		 *  ex) x == 3 ? a : b
		 * 
		 * 
		 **/
		
		// 증감연산자(++, --)
		int a = 100;
		int b1 = ++a; // ++를 먼저 계산한 후 대입한다
		int b2 = a++; // 대입 하고나서 ++를 계산한다
		
		
		System.out.println("a : " + a);
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		int x = 10;
		int y = 20;
		
		// x++
		// x = x + 1
		
		int result = ++x + y--;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("result : " + result);
		
		
		// 논리 부정 연산자(!)
		// true > false / false > true
		boolean r = x > y;
		System.out.println("r : " + r);
		boolean r2 = !r;
		System.out.println("r2 : " + r2);
		
		// 이항연산자
		// 산술연산자 : 사칙연산(+ - * / %)
		// % : 나머지 계산
		int p = 15 % 4; // 15를 4로 나눈 나머지 : 3
		System.out.println("p : " + p);
		
		
		// 결합연산자(문자열) : +
		// 문자열에서 + 기호 사용시 연걸시켜주는 연산자이다!
		String str = "x : " + x + y; 
		System.out.println(str);
		
		// 비교연산자 : == != >= <= > < : → 결과 : true / false
		boolean b = x > y;
		System.out.println("b : " + b);
		
		String str1 = "Apple";
		String str2 = "I like Apple"; // 다른공간에 있는 Apple을 가져오려고 다른내용 저장함
		String str3 =str2.split(" ")[2]; // str2을 공백 기준으로 자른 내용의 3번째내용을 str3에 담기게함 
		System.out.println(str3);
		
		System.out.println(str1 == str3); //메모리 주소 비교
		System.out.println(str1.equals(str3));// 내용 비교
		
		// 논리연산자 : &&  & ||  | ^ !
		// 논리곱 : && & → 모두 true 이면 true 
		
		boolean ba = x >= 3 && y < 3;
		System.out.println("ba : " + ba);
		
		// 논리합 : || | → 둘중 하나라도 true 이면 true
		boolean bb = x >= 3 || y <= 3; 
		System.out.println("bb : " + bb);
		
		int i = 5;
		int j = 8;
		if (i % 2 == 0 && j % 2 == 0) {
		System.out.println("i와 j는 모두 짝수입니다.");
		
		}
		 
		if (i % 2 == 0 && j % 2 == 0) {
		System.out.println("i와 j는  짝수입니다.");
		
			 
		}	 
		
		// 대입연산자(=)
		int k = 3;
		int l = 5;
		l += k;
		System.out.println("l : " + l);
		l = l + k;
		System.out.println("l : " + l);
		 
		/*
		 * 복합 대입 연산자 
		 * += : 더해서 대입 l = l + k 
		 * -= : 빼서 대입   l + 1 - k
		 * *= : 곱해서 대입 l = 1 * k 
		 * /= : 나눠서 대입 1 = 1 / k
		 * %= : 나눈 나머지를 대입
		 *  
		 * */
		 
		// 삼항연산자  
		
		
		
		
		
		
		
		
	}

}
