package greenjoa.team01;

import java.util.Scanner;

public class refrigerator extends HomeAppliance {
	private static final int case1 = 0;
	public Scanner scan = new Scanner(System.in);
	int coolTemp;
	int iceTemp;
	
	public refrigerator(String name, int coolTemp, int iceTemp) {
		super(name);
		this.coolTemp = coolTemp;
		this.iceTemp = iceTemp;
	}
	public void controlCool() {
		System.out.print("냉장온도를 입력하세요 : ");
		int a = scan.nextInt();
		if(a>=0) {
			this.coolTemp = a;
			System.out.println(coolTemp);
		}else
			System.out.println("잘못된 온도입니다.");
		
	}
	
	public void controlIce() {
		System.out.print("냉동온도를 입력하세요 : ");
		int b = scan.nextInt();
		if(b<0) {
			this.iceTemp = b;
			System.out.println(iceTemp);
		}else
			System.out.println("잘못된 온도입니다.");
	}
	
	
	
	@Override
	public void menu() {
		System.out.println("----작동----");
		label: while(true) {
		System.out.println("1) 냉장온도 조절   2)냉동온도 조절   3)종료");
		System.out.print("입력 : ");
		int Num = scan.nextInt();
		switch(Num){
		
		case 1 : 
			System.out.println("냉장온도 조절--------");
			controlCool();
			break;
		
		
		case 2 : 
			System.out.println("냉동온도 조절--------");
			controlIce();
			break;
		
		
		
		case 3 : 
			System.out.println("시스템을 종료합니다.");
		
		break label;
		
		default :
			System.out.println("다시 입력해 주세요");
			System.out.println();
			 break;
		
		}
	}
	}
	
	@Override
	public void showStatus(){
		System.out.println("냉장온도 : " + coolTemp);
		System.out.println("냉동온도 : " + iceTemp);
		
	}
}
