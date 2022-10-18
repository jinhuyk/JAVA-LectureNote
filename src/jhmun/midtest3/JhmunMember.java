package jhmun.midtest3;

public class JhmunMember {
	private String nameMember;
	private int countVolunteer;
	private int totalDonation;
	
	
	
	public JhmunMember(String nameMember) {
		this(nameMember,0,0);
	}
	public JhmunMember(String nameMember, int countVolunteer, int totalDonation) {
		super();
		this.nameMember = nameMember;
		this.countVolunteer = countVolunteer;
		this.totalDonation = totalDonation;
	}
	@Override
	public String toString() {
		String str = "회원이름 : "+this.nameMember+"\n";
		str += "자원봉사 참여 횟수 : "+this.countVolunteer+"\n";
		str += "기부 총액 : "+this.totalDonation+"\n";
		return str;
	}
	public int getTotalDonation() {
		return totalDonation;
	}
	public void setTotalDonation(int totalDonation) {
		this.totalDonation = totalDonation;
	}
	public String getNameMember() {
		return nameMember;
	}
	public void setNameMember(String nameMember) {
		this.nameMember = nameMember;
	}
	public int getCountVolunteer() {
		return countVolunteer;
	}
	public void setCountVolunteer(int countVolunteer) {
		this.countVolunteer = countVolunteer;
	}
	
	
}
