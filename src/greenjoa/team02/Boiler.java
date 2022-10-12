package greenjoa.team02;


import java.util.Scanner;

public class Boiler extends HomeAppliance implements IoTInterface {
	
	private int temperature;
	
	public Boiler (String name, int temperature) {
		super(name);
		this.temperature = temperature;
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
	public void showStatus() {
		System.out.println("<현재 보일러 상태>");
		if(this.haPower) {
			System.out.println("현재 설정 온도: " + this.temperature);
		}
		else
			System.out.println("꺼져 있음");
	}

	@Override
	public void menu() {
		label: while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1) 전원");
			System.out.println("2) 온도 설정");
			System.out.println("3) 종료");
			System.out.print("어떤 메뉴를 사용하시겠습니까?: ");
			int input = scan.nextInt();
			switch(input) {
			case 1:
				this.haPower = !(this.haPower);
				if(this.haPower)
					System.out.println("켜짐");
				else
					System.out.println("꺼짐");
				break;
			case 2:
				System.out.println("현재 설정 온도: " + this.temperature);
				System.out.print("설정할 온도: ");
				this.temperature = scan.nextInt();
				break;
			case 3 : 
				System.out.println("시스템을 종료합니다.");
				break label;
			default:
				System.out.println("잘못된 메뉴 접근입니다.");
			}
			
		}
	}
	
	
}
