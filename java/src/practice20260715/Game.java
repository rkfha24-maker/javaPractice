package practice20260715;

public class Game { // 게임이 하는 역할

	// 게임이 기억해야 할 정보(필드) -> 현재 턴,사용자,컴퓨터
	int round;
	User user = new User();
	Computer computer = new Computer();

	// 메서드 목표 : 게임 시작 전에 규칙과 메뉴를 출력
	// 객체의 정보가 필요 없으므로 static 사용
	public static void startGame() { // 게임 안내 담당
		System.out.println("주사위 게임을 시작합니다.");
		System.out.println("!! 사용자는 주사위를 세 개 선택할 수 있습니다 !!");
		System.out.println("!! 컴퓨터는 1번 주사위만 사용해서 대결합니다 !!");
		System.out.println("→ 총점이 1000점이 되면 주사위를 적게 던진 사람이 승리합니다.");
		System.out.println("==================================================");
		System.out.println("사용할 주사위 3개를 메뉴에서 고르세요 ↓");
		System.out.println("▣ 1.일반 주사위");
		System.out.println("▣ 2.모 아니면 도 주사위");
		System.out.println("▣ 3.안전빵 주사위");
		System.out.println("▣ 4.애매한 주사위");
		System.out.println("==================================================");
		System.out.println("숫자를 세번 입력해주세요 ↓");
	}

	// 메서드 목표 : 현재 플레이어와 컴퓨터의 중간 점수를 출력
	public void scoreResult() { // 점수 출력 담당
		System.out.println("사용자 : " + user.totalScore + "점");
		System.out.println("컴퓨터 : " + computer.totalScore2 + "점");

	}
	

	// 메서드 목표 : 게임이 끝날 때까지 플레이어와 컴퓨터가 번갈아 주사위를 굴림
	public void play() { // 게임 진행 담당
		// 진행 순서 : 1.플레이어가 주사위를 선택 2.컴퓨터가 주사위를 선택 3.둘 다 1000점 미만이면 게임 진행
		// 4.플레이어 → 컴퓨터 순서로 주사위를 굴림 5.중간 결과 출력 6.게임 종료 후 승패 판정
		
		user.userSelect();
		computer.comSelect();

		while (user.totalScore < 1000 && computer.totalScore2 < 1000) {

			// 플레이어 턴
			user.userthrow();

			// 플레이어가 먼저 1000점 이상이면 게임 종료
			if (user.totalScore >= 1000) {
				break;
			}
			System.out.println("------------------------------------------------");
			System.out.println("!! 컴퓨터가 주사위를 굴립니다 !!");

			// 컴퓨터 턴
			computer.comThrow();

			// 컴퓨터가 먼저 1000점 이상이면 게임 종료
			if (computer.totalScore2 >= 1000) {
				break;
			}
			System.out.println("==================================================");

			// 중간 점수 출력
			scoreResult();
		}
		System.out.println("==================================================");
		// 마지막 점수 출력
		scoreResult();
		System.out.println("==================================================");
		// 승패 판정
		winLoss();

	}

	// 메서드 목표 : 던진 횟수를 비교하여 승패를 판정
	public void winLoss() { // 게임 판정 담당

		System.out.println("< 최종 사용자 횟수 : " + user.throwCount+" >");
		System.out.println("< 최종 컴퓨터 횟수 : " + computer.throwCount2+" >");

		// 사용자가 더 적게 던졌다면?
		if (user.throwCount < computer.throwCount2) {
			System.out.println("☆★☆★ 축하드립니다 사용자가 이겼습니다 ☆★☆★");
			// 컴퓨터가 더 적게 던졌다면?
		} else if (user.throwCount > computer.throwCount2) {
			System.out.println("△▲△▲ 패배하셨습니다 컴퓨터가 이겼습니다 △▲△▲");
		} // 던진 횟수가 같다면?
		else {
			System.out.println("!! 무승부 입니다 !!");
		}
	}
}

