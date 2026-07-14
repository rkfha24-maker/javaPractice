package chapter7;

public class AirRemotControl extends RemoteControl { // 자식클래스
	int temperature;

	AirRemotControl(int temperature) {
		this.temperature = temperature;
	}

	@Override
	void powerOn() {System.out.println("전원을 켭니다.");}
	
	void powerOff() {System.out.println("전원을 끕니다.");}
	
	void temperatureUp() {
		System.out.println("현재 설정된 온도는"+temperature+"도 입니다.");}
	
	void temperatureDown() {
		System.out.println("온도를 내립니다. 현재 설정된 온도는 "+temperature+"도 입니다.");}
}
