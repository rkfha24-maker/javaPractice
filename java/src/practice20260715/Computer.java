package practice20260715;

public class Computer { // 컴퓨터가 하는 역할

	// 컴퓨터가 기억해야할 정보(필드) -> 던진횟수,총점
	int totalScore2;
	int throwCount2;

	// 컴퓨터가 사용할 주사위 객체를 저장할 배열
    // 처음에는 [null][null][null]
	Dice[] comdice = new Dice[3];

	// 메서드 목표 -> 컴퓨터는 항상 1번 주사위(Dice01)만 사용하므로 
    // Dice01 객체 3개를 생성하여 comdice 배열에 저장
	public void comSelect() {
		
		 // 진행 순서 : 1.Dice01 객체를 만든다. 2.comdice 배열에 저장한다. 3.총 3번 반복한다.
		 // new Dice01() Dice01 객체 하나 만들기 -> Dice01 설계도(Class)를 찾기 -> Dice01 생성자(Constructor)를 실행
         // 생성자 안의 코드 실행(일반 주사위 눈금 배열) -> 진짜 Dice01 객체완성 -> comdice[i]가 그 Dice01 객체를 가리킴

		for (int i = 0; i < 3; i++) {
			comdice[i] = new Dice01();
		}
	}

	// 메서드 목표 : comdice 배열에 저장된 주사위 객체를 모두 굴려 총점을 계산하고 던진 횟수를 기록한다.
	public void comThrow() {
		
		 // 진행순서 : 1.comdice 배열에서 주사위 객체를 하나씩 가져온다. 2.roll()을 실행하여 랜덤 눈금을 얻는다.
         // 3.나온 눈금을 총점에 더한다. 4.주사위 3개를 모두 굴리면 던진 횟수를 1 증가시킨다. 5.결과 출력
		
		for (int i = 0; i < 3; i++) {
			int score = comdice[i].roll(); 
			totalScore2 = totalScore2 + score;
			System.out.println((i + 1) + "번째 주사위 : " + score);

		}
		//주사위 3개를 모두 굴리면 한 턴이 끝나므로 던진 횟수 1 증가 
		throwCount2++;

		System.out.println("총점 : " + totalScore2+"점");
		System.out.println("던진 횟수 : " + throwCount2+"번");
	}
}