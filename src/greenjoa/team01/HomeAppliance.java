package greenjoa.team01;

public class HomeAppliance {
	protected String haName;
	protected boolean haPower=false;
	
	public HomeAppliance(String haName) {
		super();
		this.haName = haName;
	}

	public String getHaName() {
		return haName;
	}

	public boolean isHaPower() {
		return haPower;
	}

	public void setHaName(String haName) {
		this.haName = haName;
	}
	
	public void setHaPower(boolean haPower) {
		this.haPower = haPower;
	}
		
	public void showStatus() {
		
	};
	
	public void menu() {
		
	};	

}
