package greenjoa.team02;

import java.util.Scanner;

public class Home {
	private HomeAppliance[] apps;
	private final int NUMBER;
	private int count = 0;
	public Home(int NUMBER) {
		this.NUMBER = NUMBER;
		
		apps = new HomeAppliance[this.NUMBER];
		
	}
	
	public void buyHA(HomeAppliance app) {
		if(this.NUMBER > this.count) {
			this.apps[count++] = app;
		}
	}
	public void open() {
		
		while(true) {
			System.out.println("제어할 가전제품을 선택하세요");
			Scanner scan = new Scanner(System.in);
			
			for(int i = 0;i< this.count;i++) {
				System.out.println((i+1)+")"+apps[i].getHaName());
				
			}
			System.out.print("선택 : ");
			int menuNum = scan.nextInt();
			if(menuNum <= 0 || menuNum > this.count) {
				continue;
			}
			else {
				apps[menuNum-1].menu();
				
			}
		}
	}
	public IoTInterface connect() {
		
		while(true) {
			System.out.println("제어할 가전제품을 선택하세요");
			Scanner scan = new Scanner(System.in);
			
			for(int i = 0;i< this.count;i++) {
				if(apps[i] instanceof IoTInterface )
				System.out.println((i+1)+")"+apps[i].getHaName());
				
			}
			System.out.print("선택 : ");
			int menuNum = scan.nextInt();
			if(menuNum <= 0 || menuNum > this.count) {
				continue;
			}
			if(apps[menuNum-1] instanceof IoTInterface ) {
					IoTInterface iot = (IoTInterface) apps[menuNum-1];
					return iot;
			}
			
		}

			
	}
	
}
