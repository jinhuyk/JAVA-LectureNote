package greenjoa.team02;

import java.util.Scanner;

public class TV extends HomeAppliance {
	private int channel;
	private static int tvNum = 1;
	Scanner scan = new Scanner(System.in);
	public TV() {
		this("KONKUK TV"+(tvNum++));
	}
	
	public TV(String name) {
		this(name, 1);
	}
	public TV(String name, int channel) {
		super(name);
		this.channel = channel;
	}

	@Override
	public void showStatus() {
		String str = "TV name : "+this.getHaName()+"\n";
		if(this.isHaPower()) {
			str += "POWER : ON \n";
		}else str += "POWER : OFF \n";
		str += "Channel :"+this.channel+"\n"; 
		System.out.println(str);
	}

	@Override
	public void menu() {
		
		int menuNum;
		while(true) {
			System.out.println("1) POWER");
			System.out.println("2) Ch 변경");
			System.out.println("3) 상태보기");
			System.out.println("4) 나가기");
			System.out.println("메뉴 번호를 입력해주세요");
			menuNum = scan.nextInt();
			if(menuNum == 1) {
				this.haPower = !this.haPower;
				if(this.isHaPower()) {
					System.out.println("TV ON");
				}else System.out.println("TV OFF");
			}
			else if(menuNum== 2) {
				if(this.isHaPower()) {
					System.out.println("Ch Number: ");
					this.channel = scan.nextInt();
					System.out.println("Now Ch : "+ this.channel);
				}
				else System.out.println("NO power");
			}
			else if(menuNum == 3) {
				this.showStatus();
			}
			else if(menuNum == 4) {
				break;
			}
		}
		

	}
	
	
}
