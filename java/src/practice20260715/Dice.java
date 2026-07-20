package practice20260715;

import java.util.Random;

public class Dice { // 부모클래스에선 설계만 한다 

	// 주사위가 기억해야 할 정보(필드) -> 주사위의 눈금
	int[] eyes;

	// 메서드 목표 : 주사위를 굴려서 나온 숫자를 보여준다
	public int roll() {  
		// 랜덤도구를 만든다
		Random random = new Random();
		
		// 0~5중 하나를 뽑아서 num에 저장한다
		int num = random.nextInt(6);
		
		// eyes라는 이름표가 가리키는 배열에서 num번째 값을 꺼내서 반환한다 
		return eyes[num];
		
	}

}
	
