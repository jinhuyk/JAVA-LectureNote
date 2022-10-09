package greenjoa.team01;

import java.util.Scanner;

public class TV extends HomeAppliance {
	private int channel;
	private static int tvNum = 1;
	
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
		Scanner scan = new Scanner(System.in);
		int menuNum;
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
			this.menu();
		}
		else if(menuNum== 2) {
			if(this.isHaPower()) {
				System.out.println("Ch Number: ");
				this.channel = scan.nextInt();
				System.out.println("Now Ch : "+ this.channel);
			}
			else System.out.println("NO power");
			this.menu();
		}
		else if(menuNum == 3) {
			this.showStatus();
			this.menu();
		}
		else if(menuNum == 4) {
			
		}

	}
	
	
}
