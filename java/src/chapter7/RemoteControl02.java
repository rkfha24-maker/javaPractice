package chapter7;

import java.util.Scanner;

public class RemoteControl02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AirRemotControl airRemotControl = new AirRemotControl(20);
		TvRemoteContol tvRemoteContol = new TvRemoteContol(5, 10);
		LampRemoteControl lampRemoteControl = new LampRemoteControl();

		System.out.println("--------------");
		System.out.println("1.에어컨 리모컨");
		System.out.println("2.TV 리모컨");
		System.out.println("3.전등 리모컨");
		System.out.println("4.종료");
		System.out.println("--------------");

		int num = sc.nextInt();
		sc.nextLine();


			if (num == 1) {
				System.out.println("전원을 켜시겠습니까? -> 네 , 아니오");
				String answer = sc.nextLine();

				if (answer.equals("네")) {
					airRemotControl.powerOn();
					airRemotControl.temperatureUp();
					
					System.out.println("온도를 조절하시겠습니까? -> 네 , 아니오");
					String temperaturelAnswer = sc.nextLine();
					
				if (temperaturelAnswer.equals("네")) {
					System.out.println("현재 온도를 몇도로 설정하시겠습니까?");
					String temperaturelAnswer2 = sc.nextLine();
					int t = Integer.parseInt(temperaturelAnswer2);
					sc.nextLine();
					
					System.out.println("현재 온도는 "+t+"도 입니다.");
					
				} else if (answer.equals("아니오")) {
					airRemotControl.powerOff();
				}
				}
				
			} else if (num == 2) {
				System.out.println("전원을 켜시겠습니까? -> 네 , 아니오");
				String answer = sc.nextLine();

				if (answer.equals("네")) {
					tvRemoteContol.powerOn();

					System.out.println("채널을 조절하시겠습니까? -> 네 , 아니오");
					String volumeAnswer = sc.nextLine();

					if (volumeAnswer.equals("네")) {
						System.out.println("채널을 몇번으로 설정하시겠습니까?");
						String volumeAnswer2 = sc.nextLine();
						int t = Integer.parseInt(volumeAnswer2);
						sc.nextLine();
						
						System.out.println("현재 채널은 "+t+"번 입니다.");

					}

				} else if (answer.equals("아니오")) {
					tvRemoteContol.powerOff();
				}

			}  else if (num == 3) {
				System.out.println("전원을 켜시겠습니까? -> 네 , 아니오");
				String answer = sc.nextLine();

				if (answer.equals("네")) {
					lampRemoteControl.powerOn();

					System.out.println("밝기를 조절하시겠습니까?");
					System.out.println("네를 입력하시면 밝기가 올라갑니다.");
					System.out.println("아니로를 입력하시면 밝기가 내려갑니다.");
					String lampAnswer = sc.nextLine();

					if (lampAnswer.equals("네")) {
						lampRemoteControl.lightUp();
					} else if (lampAnswer.equals("아니오")) {
						lampRemoteControl.lightDown();
					}

				} else if (answer.equals("아니오")) {
					lampRemoteControl.powerOff();
				}
			} else {
				System.out.println("종료");
				return;

			}
		}
	}
