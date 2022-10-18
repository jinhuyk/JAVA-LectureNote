package jhmun.midtest3;

public abstract class JhmunVolunteer {
	protected String nameVolunteer;
	protected int ableMember;
	protected int nowMember;
	protected JhmunMember[] Member;
	public JhmunVolunteer(String nameVolunteer, int ableMember) {
		super();
		this.nameVolunteer = nameVolunteer;
		this.ableMember = ableMember;
	}
	public abstract String getNameVolunteer();
	
	public abstract void setNameVolunteer(String nameVolunteer);
	protected abstract void join(JhmunMember m);
	public int getNowMember() {
		return nowMember;
	}
	public void setNowMember(int nowMember) {
		this.nowMember = nowMember;
	} 
	
	
	
}
