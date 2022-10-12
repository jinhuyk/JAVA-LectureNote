package greenjoa.team02;

import java.util.Scanner;

public class Vaccum extends HomeAppliance implements IoTInterface{
	private static Scanner scanner = new Scanner(System.in);
	private int force;
	
	public Vaccum(String haName) {
		super(haName);
		this.force = 1;
	}
	public void turnOn() {
		this.haPower = true;
	}
	public void turnOff() {
		this.haPower = false;
	}
	public void control() {
		this.menu();
	}
	@Override
	public void menu() {
		int answer;
		System.out.println("--------------------");
		
		
		while(true) {
		System.out.println("청소기를 제어합니다\n");
		System.out.println("1. 청소기 전원 On/Off 2. 청소기 세기 조절 3. 청소기 제어 시스템 종료");
		System.out.print("메뉴를 입력해주세요: ");
		answer = scanner.nextInt();
		
		if(answer == 3) {
			System.out.println("시스템을 종료합니다.");
			break;
		}
		
		switch(answer) {
		case 1:
			System.out.println("--------------------");
			this.haPower = !this.haPower;
			this.showStatus();
			break;
		case 2:
			changeForce();
			break;
		default:
			System.out.println("다시 입력해주세요.");
			break;
		}
		}
	}
	
	@Override
	public void showStatus() {
		System.out.println("--------------------");
		
		if(this.haPower) {
			System.out.println("현재 전원 상태: On");
			System.out.println("현재 청소기의 세기: " + force);
		}
		else {
			System.out.println("현재 전원 상태: Off");
		}
	}
	
	private void changeForce() {
		int answer;
		scanner.nextLine();
		System.out.println("--------------------");
		
		if(this.haPower == false) {
			System.out.println("전원이 꺼져있습니다. 전원을 킨 후 다시 실행해주세요.");
			return;
		}
		
		System.out.print("청소기의 세기를 얼마큼 조절할지 선택해주세요(1 ~ 10): ");
		answer = scanner.nextInt();
		
		if(answer < 1) {
			force = 1;
		}
		else if(answer > 10) {
			force = 10;
		}
		else {
			force = answer;
		}
		
		System.out.println("--------------------");
		System.out.println("청소기의 세기를 " + force + "만큼 설정했습니다");
	}
}
