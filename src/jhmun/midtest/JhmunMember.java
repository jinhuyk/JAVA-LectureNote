package jhmun.midtest;

public class JhmunMember {
	private String name;
	private int onVolunteer;
	private int totalDonation;
	
	public JhmunMember(String name) {
		this(name, 0, 0);
	}
	
	public JhmunMember(String name, int onVolunteer, int totalDonation) {
		this.name = name;
		this.onVolunteer = onVolunteer;
		this.totalDonation = totalDonation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOnVolunteer() {
		return onVolunteer;
	}

	public void setOnVolunteer(int onVolunteer) {
		this.onVolunteer = onVolunteer;
	}

	public int getTotalDonation() {
		return totalDonation;
	}

	public void setTotalDonation(int totalDonation) {
		this.totalDonation = totalDonation;
	}

	@Override
	public String toString() {
		
		String str = "회원 이름 : "+this.name+"\n";
		str +="자원봉사 참여 횟수 : "+this.onVolunteer+"회\n";
		str +="기부 총액 : "+this.totalDonation+"원\n";
			
		return str;
	}
	
	
}
