package chapter2;

public class exam01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		int sum2 = (a * 10) + (b + 3);
		
		a = b;
		sum = a + b;
		
		//System.out.println("sum : " + sum);
		//System.out.println(sum2);
		
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + " / y : " + y);
		
		int temp = x;
		x = y;
		y = temp;
		//System.out.println("x : " + x + " / y : " + y);		
		
	
		byte bt1 = 100;
		byte bt2 = -100;
		//byte bt3 = 128; // 범위 벗어남
		short st1 = 128;
		short st2 = 30000;
		//short st3 = 100000; // 범위 벗어남 
		int it1 = 150000;
		int it2 = 95000000;
		//int it3 = 2200000000; // 범위 벗어남
		
		//long 1n1 = 1000000000000L;//
		
	
		
		String str = "I LIke Apple.";
		//System.out.println(str);
		
		
		String name = "윤가영";
		String job = "학생";
		
		String str1 = "내 이름은 " + name + "이고요,\n직업은" + job + "입니다";
		//System.out.println(str1);
		
		String str2 = "윤가영은 생각을 했습니다.			'집에 가고싶다...'";
		//System.out.println(str2);
		
		int num1;
		float num2;
		num1 = 10;
		num2 = 4.7f;
		//int div = num1 / num2
		int div = (int) (num1 * num2);
		
		
		//System.out.println(div);
		
		
		
		
		
		
	}

}
