package chapter7;

public class TvRemoteContol extends RemoteControl { // 자식클래스
	int channel;
	int volume;
	
	TvRemoteContol(int channel,int volume) {
		this.channel = channel;
		this.volume = volume;
	}
	
	@Override 
	void powerOn() {System.out.println("전원을 켭니다.");}
	
	void powerOff() {System.out.println("전원을 끕니다.");}
	
	void channelUp() {
		this.channel++;
		System.out.println("채널을 이동합니다. 현재 채널은 "+channel+"번 입니다.");}
	
	void channelDown() {
		this.channel--;
		System.out.println("채널을 이동합니다. 현재 채널은 "+channel+"번 입니다.");}
		
	void volumeUp() {
		this.volume++;
		System.out.println("볼륨을 키웁니다.");}
	
	void volumeDown() {
		this.volume--;
		System.out.println("볼륨을 줄입니다.");}
	
}
		
