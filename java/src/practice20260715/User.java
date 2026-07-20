package practice20260715;

import java.util.Scanner;

public class User { // 사용자가 하는 역할

	// 사용자가 계속 기억해야 하는 정보(필드) -> 던진횟수,총점
	int totalScore;
	int throwCount;

	// 사용자가 선택한 주사위 객체를 저장할 배열
	// 처음에는 [null][null][null]
	Dice[] userdice = new Dice[3];

	// 메서드 목표 -> 플레이어가 사용할 주사위 객체 3개를 선택하여 userdice 배열에 저장한다
	public void userSelect() {
		// 진행순서 : 1.주사위 메뉴 보여주기 2.번호입력받기 3.선택한 주사위 객체 생성 4.userdice 배열에 저장 5.3번 반복
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			int num = sc.nextInt();

			if (num == 1) {
				// new Dice01() 객체 하나 만들기 -> Dice01 설계도(클래스)를 찾음 -> Dice01 생성자를 실행
				// -> 생성자 안에 있는 코드 실행(일반 주사위 눈금 배열) -> 진짜 Dice01 객체 완성 -> userdice[0]이 Dice01객체를 가리킴
			
				userdice[i] = new Dice01();
				System.out.println("▣ 1.일반 주사위를 선택하셨습니다.");

			} else if (num == 2) {
				userdice[i] = new Dice02();
				System.out.println("▣ 2.모 아니면 도 주사위를 선택하셨습니다.");

			} else if (num == 3) {
				userdice[i] = new Dice03();
				System.out.println("▣ 3.안전빵 주사위를 선택하셨습니다.");

			} else if (num == 4) {
				userdice[i] = new Dice04();
				System.out.println("▣ 4.애매한 주사위를 선택하셨습니다.");

			} else if (num == 5) {
				break;
			}
		}
	}

	// 메서드 목표 -> userdice 배열에 저장된 주사위 객체를 모두 굴려 나온 눈금을 총점에 더하고 던진 횟수를 1 증가시킨다
	public void userthrow() {
		System.out.println("==================================================");
		System.out.println("!! 사용자가 주사위를 굴립니다 !!");

		// 진행순서 : 1.userdice 배열에서 주사위 객체를 하나씩 가져옴 2.roll()을 실행 3.나온 눈금을 총점에 더함
		// 4.한 턴이 끝나면 던진 횟수를 증가 5.결과를 출력
		
		for (int i = 0; i < 3; i++) {
			// userdice[i]에서 i번째 칸에 저장된 주사위 객체를 가져옴 -> 그 주사위 객체의 roll() 메서드를 실행
			// -> roll()이 랜덤으로 나온 눈금(int)을 반환 -> 반환된 눈금을 score 변수에 저장

			int score = userdice[i].roll();
			totalScore = totalScore + score; // 총점 = 총점 + 이번점수
			System.out.println((i + 1) + "번째 주사위 : " + score);

		}
		// 주사위 3개를 모두 굴리면 한 턴이 끝났으므로 던진 횟수 1 증가
		throwCount++;

		System.out.println("총점 : " + totalScore + "점");
		System.out.println("던진 횟수 : " + throwCount + "번");

	}
}
