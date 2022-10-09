package greenjoa.team01;

public class testMain {

	public static void main(String[] args) {
		Home home = new Home(10);
		
		home.buyHA(new TV("건국TV",15));
		home.buyHA(new refrigerator("냉장고",0,0));
		home.buyHA(new Boiler("보일러",15));
		home.buyHA(new Vaccum("청소기"));
		while(true) {
			home.open();
		}


	}

}
