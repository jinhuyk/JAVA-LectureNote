package jhmun.midtest2;

public class JhmunMember {
	private String name;
	private int countV;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountV() {
		return countV;
	}
	public void setCountV(int countV) {
		this.countV = countV;
	}
	public int getTotalDonation() {
		return totalDonation;
	}
	public void setTotalDonation(int totalDonation) {
		this.totalDonation = totalDonation;
	}
	private int totalDonation;
	
	public JhmunMember(String name) {
		this(name,0,0);
	}
	public JhmunMember(String name, int countV, int totalDonation) {
		super();
		this.name = name;
		this.countV = countV;
		this.totalDonation = totalDonation;
	}
	@Override
	public String toString() {
		
		String str = "회원 이름 : "+this.name +"\n";
		str += "자원봉사 참여 회수 : "+this.countV+"회\n";
		str += "기부 총액 : "+this.totalDonation+"원\n";
		return str;
	}
	
	
}
