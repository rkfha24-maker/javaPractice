package practice20260715;

public class Result {

	public static void main(String[] args) {
		// Game 클래스(설계도)를 보고 진짜 Game(객체)를 만든다.
		// game이라는 이름표(참조변수)가 그 객체를 가리킨다.
		Game game = new Game();

		// Game 클래스(설계도)에 있는 static startGame 메서드를 바로 실행
		Game.startGame();

		// game이라는 이름표(참조변수) -> 진짜 Game(객체) -> 그 안의 메서드 실행
		game.play();

	}
}

//메서드(Method) -> 메서드를 만들기 전에 생각해야 할 것 (무언가를 돌려줘야 하는지 , 객체가 꼭 필요한 기능인지)

//void (프로그램에게 return 돌려주는 값이 없다)
//반환값이 없다.
//행동만 하고 끝낼 때 사용한다.
//호출방법 : 객체이름.메서드이름(); -> ex) player.pet.eat(); /	player.pet.play();

//int (프로그램에게 return 숫자를 준다)
//정수(int)를 반환한다.
//숫자 하나를 가져올 때 사용한다.
//호출방법 : int 변수 = 객체이름.메서드이름(); -> ex) int score = dice.roll(); /	int fish = rod.throwCount();

//String(프로그램에게 return 문자를 준다)
//문자열(String)을 반환한다.
//글자 하나를 가져올 때 사용한다.
//호출방법 : String 변수 = 객체이름.메서드이름(); -> ex) String petName = pet.getName(); / String petType = pet.getPetType();

//boolean(프로그램에게 return 참/거짓을 준다)
//true / false를 반환한다.
//조건을 판단할 때 사용한다.
//호출방법 : boolean 변수 = 객체이름.메서드이름(); -> ex) boolean result = pet.isDead();

//double(프로그램에게 return 소수를 준다)
//소수(double)를 반환한다.
//소수 값을 가져올 때 사용한다.
//호출방법 : double 변수 = 객체이름.메서드이름(); -> ex) double avg = student.getAverage();

//static
//객체를 만들지 않아도 실행 가능하다.
//설계도(클래스)에서 바로 실행한다.
//안내문, 메뉴 출력처럼 객체 정보가 필요 없는 기능에 사용한다.
//호출방법 : 클래스이름.메서드이름(); -> ex) Game.menu(); / Game.gameInfo(); / Game.printRule();

//생성자(Constructor)
//메서드처럼 생겼지만 메서드가 아니다.
//객체가 처음 만들어질 때 자동으로 실행된다.
//반환형(void, int, String...)을 쓰지 않는다.
//호출방법 : 클래스이름 이름표 = new 클래스이름(); -> ex) Game game = new Game(); / Player player = new Player(); / Rod01 rod = new Rod01();
