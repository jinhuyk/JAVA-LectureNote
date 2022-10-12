package greenjoa.team02;

public class testMain {

	public static void main(String[] args) {
		Home home = new Home(10);
		
		home.buyHA(new TV("건국TV",15));
		home.buyHA(new refrigerator("냉장고",0,0));
		home.buyHA(new Boiler("보일러",15));
		home.buyHA(new Vaccum("청소기"));
		
		IoTInterface iot = home.connect();
		if(iot!= null) {
			iot.turnOn();
			iot.control();
			iot.turnOff();
		}
		else{
			System.out.println("연결 실패");
		}
		
		IoTInterface ii = new IoTInterface() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void control() {
				// TODO Auto-generated method stub
				
			}
			
		};

	}

}
